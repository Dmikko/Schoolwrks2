package com.example.test1.aflevering2

fun main(){



//Assignment 1
    println("Assignment 1")


    val employee1=Employee("John","Doe",1000.0)
    println(employee1)

    val employee2=Employee("Broder","Salsa",20000.0)
    println(employee2)


//Assignment 2
    println("Assignment 2")

    val laptop = Laptop("Dell", "XPS 15", 1500.0, 10)
    val smartphone = SmartPhone("Samsung", "Galaxy S21", 999.99, 64)

    println(laptop)
    laptop.powerOn()
    laptop.fold()
    laptop.powerOff()

    println(smartphone)
    smartphone.powerOn()
    smartphone.takePhoto()
    smartphone.powerOff()




//Assignment 3
    println("Assignment 3")


    val products = listOf(
        Shoe("Nike's in the Air", 120.0, 5),
        TShirt("Cotton-eye Tee", 25.0, 10),
        Book("Kotlin for Ducks", 40.0, 3)
    )

    for (product in products) {
        println(product)
        product.identifyProductCategory()
    }

}