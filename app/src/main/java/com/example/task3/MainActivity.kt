package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button =findViewById(R.id.button)
        val image1=findViewById<ImageView>(R.id.imageView1)
        val image2=findViewById<ImageView>(R.id.imageView2)
        val image3=findViewById<ImageView>(R.id.imageView3)
       fun Roll() {
           val sides=6
           var randomNo1=(1..sides).random()
           var randomNo2=(1..sides).random()
           var randomNo3=(1..sides).random()

           when(randomNo1){
               1 -> println(image1.setImageResource(R.drawable.one))
               2 -> println(image1.setImageResource(R.drawable.two))
               3 -> println(image1.setImageResource(R.drawable.three))
               4 -> println(image1.setImageResource(R.drawable.four))
               5 -> println(image1.setImageResource(R.drawable.five))
               6 -> println(image1.setImageResource(R.drawable.six))
           }
           when(randomNo2){
               1 -> println(image2.setImageResource(R.drawable.one))
               2 -> println(image2.setImageResource(R.drawable.two))
               3 -> println(image2.setImageResource(R.drawable.three))
               4 -> println(image2.setImageResource(R.drawable.four))
               5 -> println(image2.setImageResource(R.drawable.five))
               6 -> println(image2.setImageResource(R.drawable.six))
           }
           when(randomNo3){
               1 -> println(image3.setImageResource(R.drawable.one))
               2 -> println(image3.setImageResource(R.drawable.two))
               3 -> println(image3.setImageResource(R.drawable.three))
               4 -> println(image3.setImageResource(R.drawable.four))
               5 -> println(image3.setImageResource(R.drawable.five))
               6 -> println(image3.setImageResource(R.drawable.six))
           }
           if(randomNo1==6 && randomNo2==6 || randomNo1==6 && randomNo3==6 || randomNo2==6 && randomNo3==6) {
               Toast.makeText(applicationContext, "You win", Toast.LENGTH_SHORT).show()
           }
           else if(randomNo1+randomNo2==9 || randomNo1+randomNo3==9 || randomNo2+randomNo3==9){
               Toast.makeText(applicationContext, "You lose", Toast.LENGTH_SHORT).show()
           }

       }
        btn.setOnClickListener(){
        Roll()
        }
        val car1=Car("Toyota","Pink")
        val car2=Car("Mercedes Benz","Grey")
        val txt: TextView =findViewById(R.id.textView1)
        val txt2:TextView=findViewById(R.id.textView2)
        val priceOfCar1=car1.Price()
        val priceOfCar2=car2.Price()
        txt.text=priceOfCar1.toString()
        txt2.text= priceOfCar2.toString()
    }
}
class Car( val name:String ,val color:String){
    fun Price() {
        println("Your Car name is ${name} and its ${color} in color")
        //println((900000..3000000).random())
    }

}
