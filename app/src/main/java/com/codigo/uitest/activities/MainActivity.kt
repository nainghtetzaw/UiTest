package com.codigo.uitest.activities

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.codigo.uitest.R

class MainActivity : AppCompatActivity() {

    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        makeStatusBarTransparent()
        setupNavController()
    }

    private fun setupNavController() {
        val navHostFragment : NavHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController
    }

    private fun makeStatusBarTransparent() {
        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            } else {
                decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                setDecorFitsSystemWindows(true)
            }
            statusBarColor = Color.TRANSPARENT
        }
    }
}