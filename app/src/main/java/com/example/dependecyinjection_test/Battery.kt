package com.example.dependecyinjection_test

import android.util.Log


//Assume this class is 3rd party class -> you cannot edit anything here , thus cannot add @Inject here
//Thus need to create a module class for the same purpose
class Battery {
    init {
        Log.i("TAGY", "Battery Created")
    }

    fun displayBatteryPower(){
        Log.i("TAGY", "Battery is 100%")
    }
}