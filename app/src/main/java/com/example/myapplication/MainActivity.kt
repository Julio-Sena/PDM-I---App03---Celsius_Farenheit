package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtCelsius = findViewById<EditText>(R.id.txtCelsius)
        val txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)

        val btnConverter = findViewById<Button>(R.id.btn_Converter)
        btnConverter.setOnClickListener {
            if (txtCelsius.text.isEmpty()) {
                txtCelsius.error = "Digite a temperatura em Celsius"
            } else {
                val celsius = txtCelsius.text.toString().toDouble()
                val resultado: Double
                resultado = (9 * celsius + 160) / 5
                txt_Resultado.text = "$celsius Graus Celsius equivale a $resultado Graus " +
                        "Fahrenheit"
                txtCelsius.text.clear()
            }
        }
    }
}