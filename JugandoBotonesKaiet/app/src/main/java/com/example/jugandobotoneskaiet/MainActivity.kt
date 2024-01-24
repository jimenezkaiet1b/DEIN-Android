package com.example.jugandobotoneskaiet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val numBotones = 10
    private lateinit var llBotonera: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llBotonera = findViewById(R.id.llBotonera)


        val lp = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            resources.getDimensionPixelSize(R.dimen.button_height)
        )


        for (i in 0 until numBotones) {
            val button = Button(this)
            button.layoutParams = lp
            button.text = "Botón " + String.format("%02d", i)
            button.setOnClickListener(buttonClickListener(i))
            llBotonera.addView(button)

        }

        resources.getDimensionPixelSize(R.dimen.button_height)


    }

    private fun buttonClickListener(i: Int): View.OnClickListener? {
            return View.OnClickListener {
                Toast.makeText(this@MainActivity, "Boton "+String.format("%02d", i)+ " pulsado.", Toast.LENGTH_SHORT).show()
            }
    }
}