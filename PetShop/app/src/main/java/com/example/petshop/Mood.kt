package com.example.petshop

abstract class Mood( val date: String) {
    abstract fun moodrep(): String

    fun logMood() {
        println("[$date] ${moodrep()}")
    }
}