package com.example.dependecyinjection_test

import dagger.Module
import dagger.Provides


// Module for AmoledDisplay class implementing an interface
@Module
class AmoledDisplayModule(val displayRes : Int) {

    @Provides
    fun providesAmoledDisplay(amoledDisplay: AmoledDisplay):Display{
        return AmoledDisplay()
    }


}