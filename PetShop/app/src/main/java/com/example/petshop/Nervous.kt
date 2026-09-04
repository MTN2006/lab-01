package com.example.petshop

class Nervous(date: String) : Mood(date){
    override fun moodrep(): String{
        return "I'm Nervous"
    }
}
