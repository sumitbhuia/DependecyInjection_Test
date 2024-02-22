package com.example.dependecyinjection_test

import android.util.Log
import javax.inject.Inject


// This class inherits the interface Display and implements its functions
// As this class implemented a interface we need to create a @Module class for this

class AmoledDisplay @Inject constructor():Display {
    override fun turnOnScreen() {
            Log.i("TAGY", "Amoled Display is created successfully")
    }
}