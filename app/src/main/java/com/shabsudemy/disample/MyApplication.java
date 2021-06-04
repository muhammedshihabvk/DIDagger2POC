package com.shabsudemy.disample;

import android.app.Application;
import android.util.Log;


public class MyApplication extends Application {

    private static  MyApplicationComponent myApplicationComponent;
    private static MyApplication instance = null;


    @Override
    public void onCreate() {
        Log.i("dagger","application class invoked");
        super.onCreate();
        instance = this;
        myApplicationComponent = DaggerMyApplicationComponent.builder()
                .myApplicationModule(new MyApplicationModule(this))
                .build();
    }

    public static MyApplication getInstance() {
        return instance;
    }

    public static MyApplicationComponent getAppComponent() {
        return myApplicationComponent;
    }



}
