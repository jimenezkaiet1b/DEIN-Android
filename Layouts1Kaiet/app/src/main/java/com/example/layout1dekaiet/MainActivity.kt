package com.example.layout1dekaiet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frame_layout)

        val botonSuperior : Button = findViewById(R.id.superior)
        val botonCentro : Button = findViewById(R.id.cenro)
        val botonInferior : Button = findViewById(R.id.inferior)

        botonSuperior.setOnClickListener{
            setContentView(R.layout.linear_layout)
        }
        botonCentro.setOnClickListener{
            setContentView(R.layout.linear_layout)
        }
        botonInferior.setOnClickListener{
            setContentView(R.layout.linear_layout)
        }







    }
    fun click (){



    }
}