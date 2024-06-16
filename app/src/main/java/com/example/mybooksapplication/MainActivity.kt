package com.example.mybooksapplication

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.fragment.NavHostFragment
import com.example.mybooksapplication.R

class MainActivity : AppCompatActivity() {

    private val userPreferences by lazy {
        getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkAuth()
    }

    private fun checkAuth() {
        val isAuthenticated = userPreferences.getBoolean("isAuthenticated", false)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val navGraph = navController.navInflater.inflate(R.navigation.nav_graph)
        navGraph.setStartDestination(
            if (isAuthenticated) R.id.mainFragment
            else R.id.onBoardFragment
        )
        navController.graph = navGraph
    }

}