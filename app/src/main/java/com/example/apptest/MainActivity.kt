package com.example.apptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apptest.View.CalculoCovid
import com.example.apptest.ViewModel.CovidAdapter
import com.example.apptest.model.Estado


class MainActivity : AppCompatActivity() {


    private var results = mutableSetOf<Estado>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerKaio)
        val calculoBtn = findViewById<Button>(R.id.btncalculo)

        calculoBtn.setOnClickListener(View.OnClickListener
        { startActivity(Intent(this, CalculoCovid::class.java)) })

        val covidAdapter = CovidAdapter (results,this)
        recycler.adapter = covidAdapter
        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager


    }
}