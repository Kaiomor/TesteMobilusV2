package com.example.apptest.ViewModel

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apptest.R
import com.example.apptest.model.Estado

class CovidAdapter(private val list: MutableSet<Estado>,
                   private val context: Context
) : RecyclerView.Adapter<ViewHolderSas>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderSas {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycler, parent, false)

        return ViewHolderSas(view)
    }

    override fun onBindViewHolder(holder: ViewHolderSas, position: Int) {
        val character = list.elementAt(position)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}