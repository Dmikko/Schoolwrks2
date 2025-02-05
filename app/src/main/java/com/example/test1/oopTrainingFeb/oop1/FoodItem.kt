package com.example.test1.oopTrainingFeb.oop1

open class FoodItem(val name:String,
                    val description:String,
                    val price:Int) {

    open fun cook(){
        println("Cooking $name")
    }

    override fun toString(): String {
        return "FoodItem(name='$name', description='$description', price=$price)"
    }
}

class Appetizer(
    name:String,
    description: String,
    price: Int,
    val servingSize: String
):FoodItem(name,description,price){
    override fun cook(){
        println("Preparing appetizer: $name")
    }
}

class MainCourse(name: String, description: String, price: Int, val spicinessLevel: String) : FoodItem(name, description, price) {
    override fun cook() {
        println("Cooking main course: $name with spiciness level $spicinessLevel...")
    }
}

class Dessert(name: String, description: String, price: Int, val isVegan: Boolean) : FoodItem(name, description, price) {
    override fun cook() {
        println("Baking dessert: $name...")
    }
}
