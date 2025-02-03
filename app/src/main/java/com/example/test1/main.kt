package com.example.test1

fun main(){
    val cat1 = Cat("Male",2,"Tabby","House")
    val cat2 = Cat("Female",3,"Black","Norwegian")

    println(cat1.sex)
    println(cat2)

//AS2
    val bolo : String = "Ground Beef, Tomatoes, Veggies, Cheese"


    val recipe1 = Recipe(bolo, 40,3)
    println(recipe1)


    //AS3
val lamp1=Lamp(true,1)
    if (lamp1.toggleLight <= 0){
        lamp1.lightOn = false
    }


}
