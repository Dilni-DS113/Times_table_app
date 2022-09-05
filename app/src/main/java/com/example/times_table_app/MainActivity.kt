package com.example.times_table_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
  //  var output:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val multiply = findViewById<Button>(R.id.multiply)
        val rnumber1 = Random.nextInt(from = 1, until = 13)   //(0..13).random()
        val rnumber2 = Random.nextInt(from = 1, until = 13) //(0..13).random()
        val number1 = findViewById<TextView>(R.id.number1)
        val number2 = findViewById<TextView>(R.id.number2)
        number1.text = rnumber1.toString()
        number2.text = rnumber2.toString()

        multiply.setOnClickListener {
            val intent = Intent(this,productActivity::class.java)
            intent.putExtra("product", rnumber1*rnumber2) // sending this data of the two number mulplied togther named product to the prodcut activity
            startActivity(intent)

        }




    }
}