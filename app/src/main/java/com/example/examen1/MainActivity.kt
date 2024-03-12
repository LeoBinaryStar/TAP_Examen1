package com.example.examen1

import android.content.Intent
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAcceder = findViewById<Button>(R.id.acceder)
        btnAcceder.setOnClickListener{
            val intent = Intent(this,bienvenido::class.java)
            startActivity(intent)
        }

        val btnRegistrarte = findViewById<Button>(R.id.registro)
        btnRegistrarte.setOnClickListener{
            val intent = Intent(this,registrarte::class.java)
            startActivity(intent)
        }

        val btnSalir = findViewById<Button>(R.id.salir)
        btnSalir.setOnClickListener{
            finish()
        }

        val textView1 = findViewById<TextView>(R.id.correo)
        val textView2 = findViewById<TextView>(R.id.contraseña)

        val miBoton = findViewById<Button>(R.id.limpiar)
        miBoton.setOnClickListener {
            // Para limpiar el contenido de todos los TextView:
            textView1.text = ""
            textView2.text = ""
        }

    }
}