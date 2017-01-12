
# react-native-android-settings-library

A react-native component to open Android settings

## Getting started

`$ npm install react-native-android-settings-library --save`

### Mostly automatic installation

`$ react-native link react-native-android-settings-library`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.androidsettings.RNANAndroidSettingsLibraryPackage;` to the imports at the top of the file
  - Add `new RNANAndroidSettingsLibraryPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-android-settings-library'
  	project(':react-native-android-settings-library').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-android-settings-library/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-android-settings-library')
  	```


## Usage
```javascript
import RNANAndroidSettingsLibrary from 'react-native-android-settings-library';

// TODO: What do with the module?
RNANAndroidSettingsLibrary;
```
  
