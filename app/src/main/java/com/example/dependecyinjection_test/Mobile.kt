package com.example.dependecyinjection_test

import android.util.Log
import javax.inject.Inject


class Mobile @Inject constructor(val battery: Battery, val display: Display, val simCard: SimCard){
    init {
        battery.displayBatteryPower()
        simCard.connectToNetwork()
        display.turnOnScreen()

        Log.i("TAGY", "Mobile is created successfully")

    }

    fun turnOnMobile(){
        Log.i("TAGY", "Mobile is Turned ON")
    }

}