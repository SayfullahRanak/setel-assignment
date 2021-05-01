package com.sevenpeakssoftware.sayfullah.utils

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {

    companion object {
        lateinit var appInstance: Application
    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }
}