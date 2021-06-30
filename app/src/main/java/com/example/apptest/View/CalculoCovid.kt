package com.example.apptest.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.apptest.R

class CalculoCovid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo_covid)

        val btnVolta = findViewById<Button>(R.id.btnlista)

        btnVolta.setOnClickListener( { onBackPressed() })

    }
}