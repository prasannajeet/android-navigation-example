package com.example.prasa.navsample.ui.welcome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prasa.navsample.R

class WelcomeMeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name = WelcomeMeActivityArgs.fromBundle(intent.extras).myname
        showWelcome.text = "Welcome $name!"
    }
}