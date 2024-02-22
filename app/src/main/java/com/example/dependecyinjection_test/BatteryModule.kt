package com.example.dependecyinjection_test

import dagger.Module
import dagger.Provides

@Module
class BatteryModule {


    // For @Modules -> instead of @Inject we use @Provides
    @Provides
    fun providesBattery():Battery{
        return Battery()
    }

}