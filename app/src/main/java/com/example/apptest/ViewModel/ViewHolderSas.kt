package com.example.apptest.ViewModel

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apptest.R

class ViewHolderSas(itemView : View) :  RecyclerView.ViewHolder(itemView) {

    val image: ImageView = itemView.findViewById(R.id.imgCovid)
    val name: TextView = itemView.findViewById(R.id.txt_card)


}