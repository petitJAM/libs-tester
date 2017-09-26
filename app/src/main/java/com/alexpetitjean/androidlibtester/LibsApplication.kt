package com.alexpetitjean.androidlibtester

import android.app.Application
import android.os.StrictMode
import net.danlew.android.joda.JodaTimeAndroid

class LibsApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build())
            StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build())
        }

        JodaTimeAndroid.init(this)
    }
}
