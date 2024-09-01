package com.example.verificadorsenha

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextSenha = findViewById<EditText>(R.id.editTextSenha)
        val buttonVerificarSenha = findViewById<Button>(R.id.buttonVerificarSenha)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

        val senhaCorreta = "1234"

        buttonVerificarSenha.setOnClickListener {
            val senhaInserida = editTextSenha.text.toString()

            if (senhaInserida == senhaCorreta) {
                textViewResultado.text = "Senha correta"
            } else {
                textViewResultado.text = "Senha incorreta"
            }
        }
    }
}
