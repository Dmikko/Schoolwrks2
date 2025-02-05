package com.example.test1.oopTrainingFeb.oop1

class BankAccount(
    val accountNumber:String,
    initialBalance:Double
) {
    var balance:Double=initialBalance
        get()=field
        set(value){
            field=if (value < 0) 0.0 else value
        }

    override fun toString(): String {
        return "[accountNumber='$accountNumber', balance=$balance]"
    }
}