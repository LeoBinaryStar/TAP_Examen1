package com.example.examen1

import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class registroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrate)

        val btnRegistrate = findViewById<Button>(R.id.registrarR)
        btnRegistrate.setOnClickListener{
            val correo = findViewById<EditText>(R.id.correoR).text.toString()
            val contrasena = findViewById<EditText>(R.id.contraseñaR).text.toString()

            if (correo.isNotEmpty() && contrasena.isNotEmpty()){
                showSuccessDialog()
            }
        }

    }
    private fun showSuccessDialog(){
        val dialog = AlertDialog.Builder(this)
            .setTitle("Registrado :D")
            .setMessage("Te has registrado correctamente")
            .setPositiveButton("OK"){ _, _ ->
                finish()
            }
            .create()
            dialog.show()
    }

    private fun showErrorDialog(message: String){
        val dialog = AlertDialog.Builder(this)
        .setTitle("Eror :c")
            .setMessage(message)
            .setPositiveButton("OK", null)
            .create()
            dialog.show()
    }
}