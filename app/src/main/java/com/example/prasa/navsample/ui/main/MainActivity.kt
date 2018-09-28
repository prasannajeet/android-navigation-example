package com.example.prasa.navsample.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.prasa.navsample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val host = NavHostFragment.create(R.navigation.welcome_nav)
        supportFragmentManager.beginTransaction().replace(R.id.container, host).setPrimaryNavigationFragment(host).commit()
    }

    override fun onSupportNavigateUp(): Boolean = Navigation.findNavController(this, R.id.container).navigateUp()
}