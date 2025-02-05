package com.example.test1.oopTrainingFeb

class Leader(name:String, var bravery:Int):Survivor(name) {
     var isSecretlyTerrified = true

            override fun fight() {
        println("Leader kills zombie")
    }
}