---
title: Xamarin.Android errors and warnings reference
description: Build and deployment error and warning codes in Xamarin.Android, their meanings, and guidance on how to address them.
ms.date: 08/23/2019
---
# Xamarin.Android errors and warnings reference


## ADBxxxx: ADB tooling

+ [ADB0000](adb0000.md): Generic `adb` error/warning.
+ [ADB0010](adb0010.md): Generic `adb` APK installation error/warning.
+ [ADB0020](adb0020.md): The package does not support the CPU architecture of this device.
+ [ADB0030](adb0030.md): APK installation failed due to a conflict with the existing package.
+ [ADB0040](adb0040.md): The device does not support the minimum SDK level specified in the manifest.
+ [ADB0050](adb0050.md): Package {packageName} already exists on device.
+ [ADB0060](adb0060.md): There is not enough storage space on the device to store package: {packageName}. Free up some space and try again.

## ANDXXxxxx: Generic Android tooling

+ [ANDAS0000](andas0000.md): Generic `apksigner` error/warning.
+ [ANDJS0000](andjs0000.md): Generic `jarsigner` error/warning.
+ [ANDKT0000](andkt0000.md): Generic `keytool` error/warning.
+ [ANDZA0000](andza0000.md): Generic `zipalign` error/warning.

## APTxxxx: AAPT tooling

+ [APT0000](apt0000.md): Generic `aapt` error/warning.
+ [APT0001](apt0001.md): unknown option -- `{option}` . This is the result of using `aapt` command line arguments with `aapt2`. The arguments are not compatible.

## JAVACxxxx: Java compiler

+ [JAVAC0000](javac0000.md): Generic Java compiler error

## XA0xxx: Environment issue or missing tooling

+ [XA0000](xa0000.md): Could not determine $(AndroidApiLevel) or $(TargetFrameworkVersion).
+ [XA0001](xa0001.md): Invalid or unsupported `$(TargetFrameworkVersion)` value.
+ [XA0002](xa0002.md): Could not find mono.android.jar
+ [XA0003](xa0003.md): Invalid `android:versionCode` value. It must be an integer value.
+ [XA0004](xa0004.md): VersionCode {code} is outside 0, {maxVersionCode} interval.
+ [XA0030](xa0030.md): Building with JDK Version `{versionNumber}` is not supported.
+ [XA0031](xa0031.md): Java SDK {requiredJavaForFrameworkVersion} or above is required when targeting FrameworkVersion {targetFrameworkVersion}.
+ [XA0032](xa0032.md): Java SDK {requiredJavaForBuildTools} or above is required when using build-tools {buildToolsVersion}.
+ [XA0033](xa0033.md): Failed to get the Java SDK version as it does not appear to contain a valid version number.
+ [XA0034](xa0034.md): Failed to get the Java SDK version.
+ XA0100: EmbeddedNativeLibrary is invalid in Android Application project. Please use AndroidNativeLibrary instead.
+ [XA0101](xa0101.md): warning XA0101: @(Content) build action is not supported.
+ [XA0102](xa0102.md): Generic `lint` Warning.
+ [XA0103](xa0103.md): Generic `lint` Error.
+ XA0104: Invalid Sequence Point mode.
+ [XA0105](xa0105.md): The $(TargetFrameworkVersion) for a dll is greater than the $(TargetFrameworkVersion) for your project.
+ [XA0107](xa0107.md): `{Assmebly}` is a Reference Assembly.
+ [XA0108](xa0108.md): Could not get version from `lint`.
+ [XA0109](xa0109.md): Unsupported or invalid `$(TargetFrameworkVersion)` value of 'v4.5'.
+ [XA0110](xa0110.md): Disabling $(AndroidExplicitCrunch) as it is not supported by `aapt2`. If you wish to use $(AndroidExplicitCrunch) please set $(AndroidUseAapt2) to false.
+ [XA0111](xa0111.md): Could not get the `aapt2` version. Please check it is installed correctly.
+ [XA0112](xa0112.md): `aapt2` is not installed. Disabling `aapt2` support. Please check it is installed correctly.
+ [XA0113](xa0113.md): Google Play requires that new applications and updates must use a TargetFrameworkVersion of v8.0 (API level 26) or above.
+ [XA0114](xa0114.md): Google Play requires that application updates must use a `$(TargetFrameworkVersion)` of v8.0 (API level 26) or above.
+ [XA0115](xa0115.md): Invalid value 'armeabi' in $(AndroidSupportedAbis). This ABI is no longer supported. Please update your project properties to remove the old value. If the properties page does not show an 'armeabi' checkbox, un-check and re-check one of the other ABIs and save the changes.
+ [XA0116](xa0116.md): Unable to find `EmbeddedResource` of name `{ResourceName}`.
+ [XA0117](xa0117.md): The TargetFrameworkVersion {TargetFrameworkVersion} is deprecated. Please update it to be v4.4 or higher.
+ [XA0118](xa0118.md): Could not parse '{TargetMoniker}'
+ [XA0119](xa0119.md): A non-ideal configuration was found in the project.

## XA1xxx: Project related

+ [XA1000](xa1000.md): There was an problem parsing {file}. This is likely due to incomplete or invalid xml.
+ [XA1001](xa1001.md): AndroidResgen: Warning while updating Resource XML '{filename}': {Message}
+ [XA1002](xa1002.md): We found a matching key '{Key}' for '{Item}'. But the casing was incorrect. Please correct the casing
+ [XA1003](xa1003.md): '{zip}' does not exist. Please rebuild the project.
+ [XA1004](xa1004.md): There was an error opening {filename}. The file is probably corrupt. Try deleting it and building again.
+ [XA1005](xa1005.md): Attempting naive type name fixup for element with ID '{id}' and type '{managedType}'
+ [XA1006](xa1006.md): Your application is running on a version of Android ({compileSdk}) that is more recent than your targetSdkVersion specifies ({targetSdk}). Set your targetSdkVersion to the highest version of Android available to match your TargetFrameworkVersion ({compileSdk}).
+ [XA1007](xa1007.md): The minSdkVersion ({minSdk}) is greater than targetSdkVersion. Please change the value such that minSdkVersion is less than or equal to targetSdkVersion ({targetSdk}).
+ [XA1008](xa1008.md): The TargetFrameworkVersion ({compileSdk}) should not be lower than targetSdkVersion ({targetSdk})
+ [XA1009](xa1009.md): The {assembly} is Obsolete. Please upgrade to {assembly} {version}

## XA2xxx: Linker

## XA3xxx: AOT

## XA4xxx: Code generation

+ [XA4214](xa4214.md): The managed type \`Library1.Class1\` exists in multiple assemblies: Library1, Library2. Please refactor the managed type names in these assemblies so that they are not identical.
+ [XA4215](xa4215.md): The Java type \`com.contoso.library1.Class1\` is generated by more than one managed type. Please change the \[Register\] attribute so that the same Java type is not emitted.
+ [XA4216](xa4216.md): AndroidManifest.xml //uses-sdk/@android:minSdkVersion '{min_sdk?.Value}' is less than API-{XABuildConfig.NDKMinimumApiAvailable}, this configuration is not supported.
+ [XA4218](xa4218.md): Unable to find //manifest/application/uses-library at path: {path}
+ [XA4301](xa4301.md): Apk already contains the item `xxx`.
+ [XA4302](xa4302.md): Unhandled exception merging \`AndroidManifest.xml]`: {ex}
+ [XA4303](xa4303.md): Error extracting resources from "{assemblyPath}": {ex}
+ [XA4304](xa4304.md): Proguard configuration file '{file}' was not found.
+ [XA4305](xa4305.md): MultiDex is enabled, but '{nameof (MultiDexMainDexListFile)}' was not specified.
+ [XA4306](xa4306.md): R8 does not support \`@(MultiDexMainDexList)\` files when android:minSdkVersion >= 21

## XA5xxx: GCC and toolchain

+ [XA5205](xa5205.md): Cannot find `{ToolName}` in the Android SDK.
+ [XA5207](xa5207.md): Could not find android.jar for API Level `{compileSdk}`.
+ [XA5300](xa5300.md): The Android/Java SDK Directory could not be found.
+ [XA5301](xa5301.md): Failed to create JavaTypeInfo for class: {t.FullName} due to MAX_PATH: {ex}
+ [XA5302](xa5302.md): Two processes may be building this project at once. Lock file exists at path: {path}

## XA6xxx: Internal tools

## XA7xxx: Unhandled MSBuild Exceptions

Exceptions that have not been gracefully handled yet.  Ideally these will be fixed or replaced with better errors in the future.

These take the form of `XACCC7NNN`, where `CCC` is a 3 character code denoting the MSBuild Task that is throwing the exception,
and `NNN` is a 3 digit number indicating the type of the unhandled `Exception`.

**Tasks:**
* `A2C` - `Aapt2Compile`
* `A2L` - `Aapt2Link`
* `AAS` - `AndroidApkSigner`
* `ACD` - `AndroidCreateDebugKey`
* `ACM` - `AppendCustomMetadataToItemGroup`
* `ADB` - `Adb`
* `AJV` - `AdjustJavacVersionArguments`
* `AOT` - `Aot`
* `APT` - `Aapt`
* `ASP` - `AndroidSignPackage`
* `AZA` - `AndroidZipAlign`
* `BAB` - `BuildAppBundle`
* `BAS` - `BuildApkSet`
* `BBA` - `BuildBaseAppBundle`
* `BGN` - `BindingsGenerator`
* `BLD` - `BuildApk`
* `CAL` - `CreateAdditionalLibraryResourceCache`
* `CAR` - `CalculateAdditionalResourceCacheDirectories`
* `CCR` - `CopyAndConvertResources`
* `CCV` - `ConvertCustomView`
* `CDF` - `ConvertDebuggingFiles`
* `CDJ` - `CheckDuplicateJavaLibraries`
* `CFI` - `CheckForInvalidResourceFileNames`
* `CFR` - `CheckForRemovedItems`
* `CGJ` - `CopyGeneratedJavaResourceClasses`
* `CGS` - `CheckGoogleSdkRequirements`
* `CIC` - `CopyIfChanged`
* `CIL` - `CilStrip`
* `CLA` - `CollectLibraryAssets`
* `CLC` - `CalculateLayoutCodeBehind`
* `CLP` - `ClassParse`
* `CLR` - `CreateLibraryResourceArchive`
* `CMD` - `CreateMultiDexMainDexClassList`
* `CML` - `CreateManagedLibraryResourceArchive`
* `CMM` - `CreateMsymManifest`
* `CNA` - `CompileNativeAssembly`
* `CNE` - `CollectNonEmptyDirectories`
* `CNL` - `CreateNativeLibraryArchive`
* `CPD` - `CalculateProjectDependencies`
* `CPF` - `CollectPdbFiles`
* `CPI` - `CheckProjectItems`
* `CPR` - `CopyResource`
* `CPT` - `ComputeHash`
* `CRC` - `ConvertResourcesCases`
* `CRM` - `CreateResgenManifest`
* `CRN` - `Crunch`
* `CRP` - `AndroidComputeResPaths`
* `CTD` - `CreateTemporaryDirectory`
* `CTX` - `CompileToDalvik`
* `DES` - `Desugar`
* `DJL` - `DetermineJavaLibrariesToCompile`
* `DX8` - `D8`
* `FLB` - `FindLayoutsToBind`
* `FLT` - `FilterAssemblies`
* `GAD` - `GetAndroidDefineConstants`
* `GAP` - `GetAndroidPackageName`
* `GAR` - `GetAdditionalResourcesFromAssemblies`
* `GAS` - `GetAppSettingsDirectory`
* `GCB` - `GenerateCodeBehindForLayout`
* `GCJ` - `GetConvertedJavaLibraries`
* `GEP` - `GetExtraPackages`
* `GFT` - `GetFilesThatExist`
* `GIL` - `GetImportedLibraries`
* `GJP` - `GetJavaPlatformJar`
* `GJS` - `GenerateJavaStubs`
* `GLB` - `GenerateLayoutBindings`
* `GLR` - `GenerateLibraryResources`
* `GMA` - `GenerateManagedAidlProxies`
* `GMJ` - `GetMonoPlatformJar`
* `GPM` - `GeneratePackageManagerJava`
* `GRD` - `GenerateResourceDesigner`
* `IAS` - `InstallApkSet`
* `IJD` - `ImportJavaDoc`
* `JDC` - `JavaDoc`
* `JVC` - `Javac`
* `JTX` - `JarToXml`
* `KEY` - `KeyTool`
* `LAS` - `LinkApplicationSharedLibraries`
* `LEF` - `LogErrorsForFiles`
* `LNK` - `LinkAssemblies`
* `LNS` - `LinkAssembliesNoShrink`
* `LNT` - `Lint`
* `LWF` - `LogWarningsForFiles`
* `MBN` - `MakeBundleNativeCodeExternal`
* `MDC` - `MDoc`
* `MER` - `MergeResources`
* `PAI` - `PrepareAbiItems`
* `PAW` - `ParseAndroidWearProjectAndManifest`
* `PRO` - `Proguard`
* `PWA` - `PrepareWearApplicationFiles`
* `R8D` - `R8`
* `RAM` - `ReadAndroidManifest`
* `RAR` - `ReadAdditionalResourcesFromAssemblyCache`
* `RAT` - `ResolveAndroidTooling`
* `RDF` - `RemoveDirFixed`
* `RIL` - `ReadImportedLibrariesCache`
* `RJJ` - `ResolveJdkJvmPath`
* `RLC` - `ReadLibraryProjectImportsCache`
* `RLP` - `ResolveLibraryProjectImports`
* `RRA` - `RemoveRegisterAttribute`
* `RSA` - `ResolveAssemblies`
* `RSD` - `ResolveSdks`
* `RUF` - `RemoveUnknownFiles`
* `SPL` - `SplitProperty`
* `SVM` - `SetVsMonoAndroidRegistryKey`
* `UNZ` - `Unzip`
* `VJV` - `ValidateJavaVersion`
* `WLF` - `WriteLockFile`

**Exceptions:**

* `7000` - Other Exception
* `7001` - `NullReferenceException`
* `7002` - `ArgumentOutOfRangeException`
* `7003` - `ArgumentNullException`
* `7004` - `ArgumentException`
* `7005` - `FormatException`
* `7006` - `IndexOutOfRangeException`
* `7007` - `InvalidCastException`
* `7008` - `ObjectDisposedException`
* `7009` - `InvalidOperationException`
* `7010` - `InvalidProgramException`
* `7011` - `KeyNotFoundException`
* `7012` - `TaskCanceledException`
* `7013` - `OperationCanceledException`
* `7014` - `OutOfMemoryException`
* `7015` - `NotSupportedException`
* `7016` - `StackOverflowException`
* `7017` - `TimeoutException`
* `7018` - `TypeInitializationException`
* `7019` - `UnauthorizedAccessException`
* `7020` - `ApplicationException`
* `7021` - `KeyNotFoundException`
* `7022` - `PathTooLongException`
* `7023` - `DirectoryNotFoundException`
* `7024` - `IOException`

## XA8xxx:	Reserved

## XA9xxx:	Licensing
