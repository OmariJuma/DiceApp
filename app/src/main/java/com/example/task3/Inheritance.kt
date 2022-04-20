package com.example.task3

class Inheritance(override var name:String, override var color:String) : Car("",""){
   override fun price():String{
       return "Your Car name is $name, its $color in color and its price is Ksh$priceGenerator"

   }


}
fun main(){
    val inheritorOne=Inheritance("Chevrolet", "Yellow")
    val inheritorTwo=Inheritance("Audi", "Grey")
    println(inheritorOne.price())
    println(inheritorTwo.price())
}
