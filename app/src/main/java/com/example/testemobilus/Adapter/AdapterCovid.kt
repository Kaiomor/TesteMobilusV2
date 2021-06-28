package com.example.testemobilus.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.testemobilus.MainActivity
import com.example.testemobilus.R



class AdapterCovid(

    private val list: MutableSet<MainActivity>,
    private val context: Context
) : RecyclerView.Adapter <ViewHolderCovid>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCovid {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false)
        return ViewHolderCovid(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCovid, position: Int) {
        val character = list.elementAt(position)

    }

    override fun getItemCount(): Int {
       return list.size
    }
}