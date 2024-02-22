package com.example.dependecyinjection_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
       One Way
       -------
        val display = Display()
        val battery = Battery()
        val serviceProvider = ServiceProvider()
        val simCard = SimCard(serviceProvider)

       Another way
       ------------
       val mobile = Mobile(Battery(),Display(),SimCard(ServiceProvider()))
        mobile.turnOnMobile()



         Moved to MobileApplication
        ----------------------------
        DaggerMobileComponent.builder()
                .amoledDisplayModule(AmoledDisplayModule(1920))
                .build()


 */

        // This is helpful to reduce code and incorporate multiple activities
        //This is the crucial line for dependency injection
        (application as MobileApplication).mobile.inject(this)


    }
}