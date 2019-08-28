package com.ginyolith.mockmodesample

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
class MockModule {
    @Provides
    @IsMockMode
    fun provideIsMockMode(@DebugInstance pref : SharedPreferences) : Boolean {
        return pref.getBoolean("isMockMode", false)
    }

    @Provides
    @DebugInstance
    fun provideSharedPreference(app : Application): SharedPreferences {
        return app.getSharedPreferences("debugPreference", Context.MODE_PRIVATE)
    }

}