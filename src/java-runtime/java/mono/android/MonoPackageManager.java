package mono;

import java.io.*;
import java.lang.String;
import java.util.Locale;
import java.util.HashSet;
import java.util.zip.*;
import java.util.Arrays;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.util.Log;
import mono.android.Runtime;
import mono.android.DebugRuntime;
import mono.android.BuildConfig;

public class MonoPackageManager {

	// Exists only since API23 onwards, we must define it here
	static final int FLAG_EXTRACT_NATIVE_LIBS = 0x10000000;

	static Object lock = new Object ();
	static boolean initialized;

	static android.content.Context Context;

	public static void LoadApplication (Context context, ApplicationInfo runtimePackage, String[] apks)
	{
		synchronized (lock) {
			if (context instanceof android.app.Application) {
				Context = context;
			}
			if (!initialized) {
				android.content.IntentFilter timezoneChangedFilter  = new android.content.IntentFilter (
						android.content.Intent.ACTION_TIMEZONE_CHANGED
				);
				context.registerReceiver (new mono.android.app.NotifyTimeZoneChanges (), timezoneChangedFilter);

				Locale locale       = Locale.getDefault ();
				String language     = locale.getLanguage () + "-" + locale.getCountry ();
				String filesDir     = context.getFilesDir ().getAbsolutePath ();
				String cacheDir     = context.getCacheDir ().getAbsolutePath ();
				String dataDir      = getNativeLibraryPath (context);
				ClassLoader loader  = context.getClassLoader ();
				java.io.File external0 = android.os.Environment.getExternalStorageDirectory ();
				String externalDir = new java.io.File (
							external0,
							"Android/data/" + context.getPackageName () + "/files/.__override__").getAbsolutePath ();
				String externalLegacyDir = new java.io.File (
							external0,
							"../legacy/Android/data/" + context.getPackageName () + "/files/.__override__").getAbsolutePath ();
				boolean embeddedDSOsEnabled = (runtimePackage.flags & FLAG_EXTRACT_NATIVE_LIBS) == 0;
				String runtimeDir = getNativeLibraryPath (runtimePackage);
				String[] appDirs = new String[] {filesDir, cacheDir, dataDir};
				String[] externalStorageDirs = new String[] {externalDir, externalLegacyDir};

				//
				// Preload DSOs libmonodroid.so depends on so that the dynamic
				// linker can resolve them when loading monodroid. This is not
				// needed in the latest Android versions but is required in at least
				// API 16 and since there's no inherent negative effect of doing it,
				// we can do it unconditionally.
				//
				// We need to use our own `BuildConfig` class to detect debug builds here because,
				// it seems, ApplicationInfo.flags information is not reliable - in the debug builds
				// (with `android:debuggable=true` present on the `<application>` element in the
				// manifest) using shared runtime, the `runtimePackage.flags` field does NOT have
				// the FLAGS_DEBUGGABLE (0x00000002) set and thus we'd revert to the `else` clause
				// below, leading to an error locating the Mono runtime
				//
				if (BuildConfig.Debug) {
					System.loadLibrary ("xamarin-debug-app-helper");
					DebugRuntime.init (apks, runtimeDir, appDirs, externalStorageDirs, android.os.Build.VERSION.SDK_INT, embeddedDSOsEnabled);
				} else {
					System.loadLibrary("monosgen-2.0");
				}
				System.loadLibrary("xamarin-app");
				System.loadLibrary("monodroid");

				Runtime.initInternal (
						language,
						apks,
						runtimeDir,
						appDirs,
						loader,
						externalStorageDirs,
						MonoPackageManager_Resources.Assemblies,
						android.os.Build.VERSION.SDK_INT,
						embeddedDSOsEnabled
					);

				mono.android.app.ApplicationRegistration.registerApplications ();

				initialized = true;
			}
		}
	}

	public static void setContext (Context context)
	{
		// Ignore; vestigial
	}

	static String getNativeLibraryPath (Context context)
	{
	    return getNativeLibraryPath (context.getApplicationInfo ());
	}

	static String getNativeLibraryPath (ApplicationInfo ainfo)
	{
		if (android.os.Build.VERSION.SDK_INT >= 9)
			return ainfo.nativeLibraryDir;
		return ainfo.dataDir + "/lib";
	}

	public static String[] getAssemblies ()
	{
		return MonoPackageManager_Resources.Assemblies;
	}

	public static String[] getDependencies ()
	{
		return MonoPackageManager_Resources.Dependencies;
	}

	public static String getApiPackageName ()
	{
		return MonoPackageManager_Resources.ApiPackageName;
	}
}
