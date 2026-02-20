package com.example.appimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso = findViewById<EditText>(R.id.peso)
        val altura = findViewById<EditText>(R.id.altura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {

            val v1 = peso.text.toString()
            val v2 = altura.text.toString()

            if (v1.isNotEmpty() && v2.isNotEmpty()) {

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("peso", v1)
                intent.putExtra("altura", v2)
                startActivity(intent)

            }
        }
    }
}