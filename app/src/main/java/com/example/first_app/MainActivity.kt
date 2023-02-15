package com.example.first_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var mensaje: String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.txt_output)
        val boton = findViewById<Button>(R.id.btn_click)
        intent.extras?.let { bundle ->  mensaje = bundle.getString("mensaje") }
        texto.text = mensaje

        boton.setOnClickListener {
            navegarSegundaActivity()
        }
    }

    fun navegarSegundaActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("nombre", "Alan")
        startActivity(intent)
    }
}