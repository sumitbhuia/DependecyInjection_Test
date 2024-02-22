package com.example.dependecyinjection_test

import android.app.Application


class MobileApplication : Application() {
    lateinit var mobile: MobileComponent

    override fun onCreate() {
        mobile = initDagger()
        super.onCreate()
    }

    private fun initDagger(): MobileComponent = DaggerMobileComponent.builder()
        .amoledDisplayModule(AmoledDisplayModule(1920))
        .build()




}
