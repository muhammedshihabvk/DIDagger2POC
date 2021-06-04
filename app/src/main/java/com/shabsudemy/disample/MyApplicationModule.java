package com.shabsudemy.disample;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyApplicationModule {

    private Application mApp;

    public MyApplicationModule(Application app) {
        mApp = app;
    }

    @Singleton
    @Provides
    NetworkApi provideNetworkApi() {
        return new NetworkApi();
    }
}