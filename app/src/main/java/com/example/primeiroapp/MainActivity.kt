package com.example.primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.EdtPeso)
        val edtAltura = findViewById<TextInputEditText>(R.id.EdtAltura)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            val pesoStr   = edtPeso.text.toString()
            val alturaStr  = edtAltura.text.toString()



            if (pesoStr.isNotEmpty() && alturaStr.isNotEmpty()){
                val altura = edtAltura.text.toString().toFloat()
                val peso = edtPeso.text.toString().toFloat()

                val alturaFinal = altura * altura
                val resultado1 = peso / alturaFinal

                val intent = Intent(this, ResultActivity::class.java)
                    .apply {
                        putExtra("EXTRA_RESULT", resultado1)
                        //putExtra("EXTRA_NAME", Name)
                    }
                startActivity(intent)
            }else {
                Toast.makeText(this, "preencher todos os campos", Toast.LENGTH_LONG).show()

                // Cores
                // EditText background + icone
                // Gradiente + icone + titulo + descrição

            }
        }

    }
}