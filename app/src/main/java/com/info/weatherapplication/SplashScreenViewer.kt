package com.info.weatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenViewer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_viewer)

        Handler().postDelayed( {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },5000)

    }
    }
