package com.example.test1.oopTrainingFeb.oop1




fun main(){

   val animals= listOf(

       Dog("Buddy"),
       Cat("John"),
       Dog("Benson"),
       Cat("M-Jackson"),
       Dog("ShiverMeTimbers"),
       Animal("Snake",0,false)
   )
    for (animal in animals){
        println(animal)
        animal.makeSound()
    }




val menuItems = listOf(
    Appetizer("ShitSoup","tastes like heaving but looks like shit",100,"1 person"),
    MainCourse("GetFckedRoast","Enough food to feed an elephant",200,"super spicy"),
    Dessert("GetUp-GetOut","In no way tasty, we just want you to leave",400,false)
)
for (item in menuItems){
    println(item)
    item.cook()
}



    val account = BankAccount("123456",100.0)
    println(account)
    account.balance= -50.0
    println(account)







}