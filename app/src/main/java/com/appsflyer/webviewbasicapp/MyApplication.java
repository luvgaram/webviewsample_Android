package com.appsflyer.webviewbasicapp;
import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("EJ test", "EJ test");
        AppsFlyerLib.getInstance().init(getString(R.string.af_dev_key), null, this);
        Log.d("EJ test", (getString(R.string.af_dev_key)));
    }
}
