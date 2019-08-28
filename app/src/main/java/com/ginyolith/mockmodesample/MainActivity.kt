package com.ginyolith.mockmodesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import android.content.Intent



class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: SampleRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as SampleApplication).component.inject(this)

        textView.text = repository.getHelloWorld()
        button.setOnClickListener {
            startActivity(Intent(this, DebugActivity::class.java))
        }
    }
}
