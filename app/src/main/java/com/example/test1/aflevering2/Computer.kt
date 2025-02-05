package com.example.test1.aflevering2

open class Computer(
    val brand: String,
    val model: String,
    val price: Double
) {
    open fun powerOn() {
        println("$brand $model is powering on...")
    }

    open fun powerOff() {
        println("$brand $model is shutting down...")
    }

    override fun toString(): String {
        return "[brand=$brand, model=$model, price=$price]"
    }
}

class Laptop(brand: String, model: String, price: Double, val batteryLife: Int) : Computer(brand, model, price) {
    fun fold() {
        println("$brand $model is being folded...")
    }
}

class SmartPhone(brand: String, model: String, price: Double, val cameraMegapixels: Int) : Computer(brand, model, price) {
    fun takePhoto() {
        println("$brand $model is taking a photo with $cameraMegapixels MP camera...")
    }
}

