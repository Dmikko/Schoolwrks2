package com.example.test1.oopTrainingFeb


open class Survivor(val name: String) {
   open fun fight() {
        println("fighting zombie")
    }


    override fun toString(): String {
        return "Survivor(name='$name')"
    }
}