package com.example.workoutapp.Activity.IntroActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.workoutapp.Activity.MainActivity.MainActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroScreen(onStartCLick = {
            startActivity(Intent(this, MainActivity::class.java))
            })
        }
    }
}