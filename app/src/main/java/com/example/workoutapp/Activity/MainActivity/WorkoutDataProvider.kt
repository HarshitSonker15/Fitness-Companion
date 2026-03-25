package com.example.workoutapp.Activity.MainActivity

import com.example.workoutapp.Model.Lesson
import com.example.workoutapp.Model.Workout

object WorkoutDataProvider {

    fun getData(): List<Workout> = listOf(
        Workout("Running", "Desc...", "pic_1", 160, "9 min", getLessons1()),
        Workout("Stretching", "Desc...", "pic_2", 230, "85 min", getLessons2()),
        Workout("Yoga", "Desc...", "pic_3", 180, "65 min", getLessons3())
    )

    fun getLessons1() = listOf(
        Lesson("Lesson 1", "03:46", "HBPMvFkpNgE", "pic_1_1"),
        Lesson("Lesson 2", "03:41", "K6I24WgiiPw", "pic_1_2"),
        Lesson("Lesson 3", "01:57", "Zc08v4YYOeA", "pic_1_3"),
        Lesson("Lesson 4", "01:57", "Zc08v4YYOeA", "pic_1_3"),
        Lesson("Lesson 5", "01:57", "Zc08v4YYOeA", "pic_1_3"),
        Lesson("Lesson 6", "01:57", "Zc08v4YYOeA", "pic_1_3"),
        Lesson("Lesson 7", "01:57", "Zc08v4YYOeA", "pic_1_3"),
        Lesson("Lesson 8", "01:57", "Zc08v4YYOeA", "pic_1_3")
    )
    fun getLessons2() = listOf(
        Lesson("Lesson 1", "20:23", "L3eImBAXT7I", "pic_3_1"),
        Lesson("Lesson 2", "18:27", "47ExgzO7FlU", "pic_3_2"),
        Lesson("Lesson 3", "32:25", "OmLx8tmaQ-4", "pic_3_3"),
        Lesson("Lesson 4", "07:52", "w86EalEoFRY", "pic_3_4")
    )
    fun getLessons3() = listOf(
        Lesson("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"),
        Lesson("Lesson 2", "27:00", "Eml2xnoLpYE", "pic_3_2"),
        Lesson("Lesson 3", "25:00", "v7SN-d4qXx0", "pic_3_3"),
        Lesson("Lesson 4", "21:00", "LqXZ628YNj4", "pic_3_4")
    )

}