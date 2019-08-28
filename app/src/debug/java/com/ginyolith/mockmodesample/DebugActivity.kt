package com.ginyolith.mockmodesample

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DebugActivity : AppCompatActivity() {

    private val module by lazy {
        MockModule()
    }

    private val pref by lazy {
        module.provideSharedPreference(application)
    }

    @SuppressLint("ApplySharedPref")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debug)

        val btn = findViewById<Button>(R.id.toggleButton)
        btn.setOnClickListener {
            pref.edit().run {
                val current = pref.getBoolean("isMockMode", false)
                putBoolean("isMockMode", !current)
                commit()
            }

            Runtime.getRuntime().exit(0)
        }
    }
}
