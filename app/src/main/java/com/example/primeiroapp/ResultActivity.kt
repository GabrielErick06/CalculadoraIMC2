package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.content.Intent

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)




        val imc = intent.getFloatExtra("EXTRA_RESULT", 0f)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvClassification = findViewById<TextView>(R.id.tvClassification)

        val classificacao =  if (imc < 18.5f){
            "Abaixo do peso"
        }
        else if (imc >= 18.5f && imc < 24.9f){
            "Peso ideal"
        }
        else if (imc >= 24.9f && imc <29.9f ){
            "Sobrepeso"
        }
        else if (imc >= 29.9f && imc <34.9f){
            "Obesidade grau I"
        }
        else if (imc >= 34.9f && imc <39.9f){
            "Obesidade grau II"
        }
        else {
            "Obesidade grau III"
        }

        tvClassification.text =  (classificacao)

        tvResult.text = imc.toString()

        val btnTabela = findViewById<Button>(R.id.btnTabela)

        btnTabela.setOnClickListener{
            tela3()
        }



    }

    private fun tela3() {
        val TelaTabela = Intent(this,ClassificationActivity::class.java)
        startActivity(TelaTabela)
    }

}