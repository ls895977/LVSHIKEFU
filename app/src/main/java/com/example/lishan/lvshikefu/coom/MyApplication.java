package com.example.lishan.lvshikefu.coom;

import android.content.Context;

import com.lykj.aextreme.afinal.common.BaseApplication;
import com.tencent.smtt.sdk.QbSdk;

public class MyApplication extends BaseApplication {
    private static MyApplication app;

    public static MyApplication getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {

            }

            @Override
            public void onViewInitFinished(boolean b) {

            }
        };
        QbSdk.initX5Environment(getApplicationContext(), cb);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}
