package com.example.dependecyinjection_test

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    init {
        Log.i("TAGY", "Sim Card Created")
    }

    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }
}