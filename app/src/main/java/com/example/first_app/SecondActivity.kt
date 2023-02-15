package com.example.first_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    
    private var nombre: String? = ""
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val texto = findViewById<TextView>(R.id.txt_output)
        val boton = findViewById<Button>(R.id.btn_click)
        //intent.getBundleExtra(intent.extras?)
        intent.extras?.let { bundle ->  nombre = bundle.getString("nombre") }
        texto.text = nombre
        
        boton.setOnClickListener {
            returnToMain()
        }
    }
    
    

    fun returnToMain(){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("mensaje", "Estas regresando al primer activity")
        startActivity(intent)
    }
}