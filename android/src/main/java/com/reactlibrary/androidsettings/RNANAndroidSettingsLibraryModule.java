
package com.reactlibrary.androidsettings;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNANAndroidSettingsLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNANAndroidSettingsLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNANAndroidSettingsLibrary";
  }

  @ReactMethod
  public void open(String type_setting) {
    Intent intentCl = new Intent();
    switch (type_setting) {
        case "ACTION_SETTINGS":
            intentCl.setAction(Settings.ACTION_SETTINGS);
            break;
        case "ACTION_WIRELESS_SETTINGS":
            intentCl.setAction(Settings.ACTION_WIRELESS_SETTINGS);
            break;
        case "ACTION_AIRPLANE_MODE_SETTINGS":
            intentCl.setAction(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
            break;
        case "ACTION_WIFI_SETTINGS":
            intentCl.setAction(Settings.ACTION_WIFI_SETTINGS);
            break;
        case "ACTION_APN_SETTINGS":
            intentCl.setAction(Settings.ACTION_APN_SETTINGS);
            break;
        case "ACTION_BLUETOOTH_SETTINGS":
            intentCl.setAction(Settings.ACTION_BLUETOOTH_SETTINGS);
            break;
        case "ACTION_DATE_SETTINGS":
            intentCl.setAction(Settings.ACTION_DATE_SETTINGS);
            break;
        case "ACTION_LOCALE_SETTINGS":
            intentCl.setAction(Settings.ACTION_LOCALE_SETTINGS);
            break;
        case "ACTION_INPUT_METHOD_SETTINGS":
            intentCl.setAction(Settings.ACTION_INPUT_METHOD_SETTINGS);
            break;
        case "ACTION_DISPLAY_SETTINGS":
            intentCl.setAction(Settings.ACTION_DISPLAY_SETTINGS);
            break;
        case "ACTION_SECURITY_SETTINGS":
            intentCl.setAction(Settings.ACTION_SECURITY_SETTINGS);
            break;
        case "ACTION_LOCATION_SOURCE_SETTINGS":
            intentCl.setAction(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            break;
        case "ACTION_INTERNAL_STORAGE_SETTINGS":
            intentCl.setAction(Settings.ACTION_INTERNAL_STORAGE_SETTINGS);
            break;
        case "ACTION_MEMORY_CARD_SETTINGS":
            intentCl.setAction(Settings.ACTION_MEMORY_CARD_SETTINGS);
            break;
        case "ACTION_APPLICATION_DETAILS_SETTINGS":
            intentCl.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
            Uri uri = Uri.fromParts("package", reactContext.getPackageName(), null);
            intentCl.setData(uri);
            break;
        default:
            intentCl.setAction(Settings.ACTION_SETTINGS);
            break;
    }


    intentCl.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    reactContext.startActivity(intentCl);
  }

  @ReactMethod
  public void main() {
      open("main");
  }
}
