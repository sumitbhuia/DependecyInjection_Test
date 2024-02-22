package com.example.dependecyinjection_test

import dagger.Component


// This class holds all the modules , and then injects them with custom inject function
// Component is an interface

@Component(modules = [BatteryModule::class , AmoledDisplayModule::class])
interface MobileComponent {
    fun inject(mainActivity: MainActivity)
}