package com.example.examen1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class registrarte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrate)

        val btnRegistrar = findViewById<Button>(R.id.registrarR)
        btnRegistrar.setOnClickListener{
            val correo = findViewById<EditText>(R.id.correoR).text.toString()
            val contraseña = findViewById<EditText>(R.id.contraseñaR).text.toString()

            val mensaje = "Registro satisfactorio"
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

            val btnVolver = findViewById<Button>(R.id.volverR)
            btnVolver.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    private  fun crearUsuarioAleatorio(correo: String, no: Int):String{
        val nombreUsuario = correo.split("").joinToString (""){it.take(1) }

        val usuario = "$nombreUsuario$no"

        return usuario
    }
}