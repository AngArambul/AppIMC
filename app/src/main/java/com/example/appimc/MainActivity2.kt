package com.example.appimc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvRes = findViewById<TextView>(R.id.textView)

        val n1 = intent.getStringExtra("peso")
        val n2 = intent.getStringExtra("altura")

        if (n1 != null && n2 != null) {

            val peso = n1.toDouble()
            val altura = n2.toDouble()

            val imc = peso / (altura * altura)

            tvRes.text = String.format("Tu IMC es: %.2f", imc)

        } else {
            tvRes.text = "Error en los datos"
        }
    }
}