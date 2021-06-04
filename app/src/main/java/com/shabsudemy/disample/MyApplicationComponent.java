package com.shabsudemy.disample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MyApplicationModule.class})
public interface MyApplicationComponent {
    void inject(MainActivity activity);
    void inject(MainActivity2 activity2);
}