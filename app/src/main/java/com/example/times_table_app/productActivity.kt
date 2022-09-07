package com.example.times_table_app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class productActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        //------ Parcelbale multiple values ------
        val p = intent.getParcelableExtra<product>("product")
        val product = findViewById<TextView>(R.id.product)
        product.text = p?.oPResult.toString() // this is a nullable result so ?



        // ------ Multiple value sending ------
     //   val n1 = intent.getIntExtra("number1", 0) // this acivity revsives data from the main actvity
     //   val n2 = intent.getIntExtra("number2", 0)
     //   val product = findViewById<TextView>(R.id.product)
     //   product.text = (n1 * n2).toString()

        //------ Single value sending ------
     //   val p = intent.getIntExtra("product", 0) // this acivity revsives data from the main actvity
     //   val product = findViewById<TextView>(R.id.product)
     //   product.text = p.toString()


    }
}