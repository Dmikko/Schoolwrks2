package com.example.test1.oopTrainingFeb

open class Person(age: Int, name: String){
    val applePrice = 10

    init{
        println("My name is $name.")
        println("My age is $age")
    }

    open fun walk(){
        println("walking is good for your health")
    }
}

class CodingTeacher(age:Int, name:String):Person(age, name){


}