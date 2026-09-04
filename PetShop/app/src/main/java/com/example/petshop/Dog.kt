package com.example.petshop

class Dog(name: String, age: Int): Pet(name, age), Pettable{
    override fun speak(): String {
        return "Woof"
    }
    override fun pet() {
        println("$name is being petted")
    }
}
