package com.example.test1.aflevering2

class Employee(
    val firstName:String,
    val lastName:String,
    var monthlySalary:Double
) {

    var salary:Double=monthlySalary
        get()=field
        set(value){
            field=if (value < 0) 0.0 else value
        }

    var yearlySalary:Double=monthlySalary*12

    var imProudOfYouSon:Double=yearlySalary*1.10



    override fun toString(): String {
        return "Employee(Name: $firstName $lastName, current monthly salary: $salary, yearly salary: $yearlySalary. -If employee was to be given a raise for " +
                "effort, then the annual salary would amount to $imProudOfYouSon)"
    }
}