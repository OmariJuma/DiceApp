package com.example.task3

class Inheritance(override var name:String) : Car("",""){
   override fun price():String{
        return "This model is still in its inception, its name is $name"
    }


}
fun main(){
    val inheritorOne=Inheritance("Chevrolet")
    println(inheritorOne.price())
}
