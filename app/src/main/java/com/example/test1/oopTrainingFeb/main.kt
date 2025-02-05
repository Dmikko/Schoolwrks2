package com.example.test1.oopTrainingFeb

fun main(){

    val sophie = Leader("Sophie",60)
    println(sophie.isSecretlyTerrified)

    val peter = Medic("Peter",3)

    val michael=TheGuyWhoDies("Michael",100)

    println(sophie)

    sophie.fight()
    peter.fight()
    michael.fight()

}