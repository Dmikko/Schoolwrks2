package com.example.test1.oopTrainingFeb.oop1

open class Animal(val name:String, val nrOfLegs:Int,val isMammal:Boolean) {
     open fun makeSound(){
     println("rawr")
     }

    override fun toString(): String {
        return "Animal(name='$name', nrOfLegs=$nrOfLegs, isMammal=$isMammal)"
    }


}


class Dog(name:String):Animal(name,4,true){
    override fun makeSound(){
        println("Woof Woof")
    }
}

class Cat(name:String):Animal(name,4,true){
    override fun makeSound(){
        println("Miaw")
    }
}