package com.example.test1.oopTrainingFeb

class TheGuyWhoDies(name:String, val tripChance:Int): Survivor(name) {

    override fun fight(){
        println("Trips and dies")
    }
}