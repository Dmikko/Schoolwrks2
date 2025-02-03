package com.example.test1

class Cat(
    val sex: String,
    var age: Int,
    val color: String,
    val breed: String,
) {
    //Following code makes it possible to just println(catX) and get all the parameters
    override fun toString(): String {
        return "Cat(sex='$sex', age=$age, color='$color', breed='$breed')"
    }
}