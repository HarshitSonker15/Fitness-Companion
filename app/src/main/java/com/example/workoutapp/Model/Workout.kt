package com.example.workoutapp.Model

import java.io.Serializable

data class Workout(
    val title: String,
    val description: String,
    val picPath: String,
    val kcal: Int,
    val durationAll: String,
    val lessons: List<Lesson>
) : Serializable
