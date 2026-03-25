package com.example.workoutapp.Activity.WorkoutActivity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.workoutapp.Model.Lesson

@Composable
fun ExerciseList(lessons: List<Lesson>){
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        lessons.forEach { lessons->
            LessonRow(lessons)
        }
    }
}