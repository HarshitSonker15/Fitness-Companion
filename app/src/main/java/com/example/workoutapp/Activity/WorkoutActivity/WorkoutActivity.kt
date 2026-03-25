package com.example.workoutapp.Activity.WorkoutActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.workoutapp.Model.Workout
import com.example.workoutapp.R

class WorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val workout = intent.getSerializableExtra("object") as Workout
        setContent{
            WorkoutScreen(
                workout = workout,
                onBack = {finish()},
                onStart = {}
                )
        }
    }
}