package com.example.task3

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

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
           val randomNo1=(1..sides).random()
           val randomNo2=(1..sides).random()
           val randomNo3=(1..sides).random()

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
       }
        btn.setOnClickListener(){
        Roll()
        }
    }
}