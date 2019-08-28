package com.ginyolith.mockmodesample

import android.app.ActivityManager
import android.app.Application
import android.content.Context


class SampleApplication : Application() {

    val component: SampleComponent by lazy { DaggerSampleComponent.builder()
        .setApp(this)
        .build() }

    override fun onCreate() {
        super.onCreate()
    }
}