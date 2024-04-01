package com.example.primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ClassificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classification)


       /* val btnVoltar = findViewById<Button>(R.id.btnVoltar)

             btnVoltar.setOnClickListener{
                 tela2()
        }*/

    }

    /*private fun tela2() {
        val voltarTela= Intent(this,ResultActivity::class.java)
        voltarTela = intent.getFloatExtra("EXTRA_RESULT", 0f)
        startActivity(voltarTela)
    }*/
}