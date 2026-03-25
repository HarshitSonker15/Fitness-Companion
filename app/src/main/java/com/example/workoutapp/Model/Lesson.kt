package com.example.workoutapp.Model

import java.io.Serializable

data class Lesson(
    val title: String,
    val duration: String,
    val link: String,
    val picPath: String
) : Serializable
