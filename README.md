
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
Require the `react-native-android-settings-library` module.
```javascript
import RNANAndroidSettingsLibrary from 'react-native-android-settings-library';
```

Show system settings
```javascript
RNANAndroidSettingsLibrary.main();
```

Show certain settings
```javascript
RNANAndroidSettingsLibrary.open('ACTION_WIFI_SETTINGS');
```

Here are list of settings [android settings](https://developer.android.com/guide/components/intents-common.html#Settings)
- ACTION_SETTINGS
- ACTION_WIRELESS_SETTINGS
- ACTION_AIRPLANE_MODE_SETTINGS
- ACTION_WIFI_SETTINGS
- ACTION_APN_SETTINGS
- ACTION_BLUETOOTH_SETTINGS
- ACTION_DATE_SETTINGS
- ACTION_LOCALE_SETTINGS
- ACTION_INPUT_METHOD_SETTINGS
- ACTION_DISPLAY_SETTINGS
- ACTION_SECURITY_SETTINGS
- ACTION_LOCATION_SOURCE_SETTINGS
- ACTION_INTERNAL_STORAGE_SETTINGS
- ACTION_MEMORY_CARD_SETTINGS


