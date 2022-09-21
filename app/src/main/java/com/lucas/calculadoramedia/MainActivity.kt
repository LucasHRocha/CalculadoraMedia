package com.lucas.calculadoramedia

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btMed = btnMed
        val tvResultado = txt_resultado

        btMed.setOnClickListener {
            val etNumber1 = Integer.parseInt(n1.text.toString())
            val etNumber2 = Integer.parseInt(n2.text.toString())
            val media = (etNumber1 + etNumber2) / 2

            if (media >= 6) {
                tvResultado.setText(media.toString())
                tvResultado.setTextColor(Color.GREEN)
                Toast.makeText(this, "Aprovado", Toast.LENGTH_LONG).show()
            } else if (media == 4) {
                tvResultado.setText(media.toString())
                tvResultado.setTextColor(Color.YELLOW)
                Toast.makeText(this, "Exame", Toast.LENGTH_LONG).show()
            } else {
                tvResultado.setText(media.toString())
                tvResultado.setTextColor(Color.RED)
                Toast.makeText(this, "Reprovado", Toast.LENGTH_LONG).show()
            }
        }
    }
}