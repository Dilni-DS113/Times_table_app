package com.example.times_table_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class productActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val p = intent.getIntExtra("product", 0) // this acivity revsives data from the main actvity
        val product = findViewById<TextView>(R.id.product)
        product.text = p.toString()


    }
}