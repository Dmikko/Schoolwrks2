package com.example.test1.aflevering2

open class Product(
    val name: String,
    val price: Double,
    val quantity: Int
) {
    open fun identifyProductCategory() {
        println("I am a generic product")
    }

    override fun toString(): String {
        return "[name=$name, price=$price, quantity=$quantity]"
    }
}

class Shoe(name: String, price: Double, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a shoe")
    }
}

class TShirt(name: String, price: Double, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a T-shirt")
    }
}

class Book(name: String, price: Double, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a book")
    }
}
