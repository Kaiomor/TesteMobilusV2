package com.example.apptest.model

import com.google.gson.annotations.SerializedName

data class Estado(
    @SerializedName("province")
    val province: String,
    @SerializedName("confirmed")
    val confirmed: Int,
    @SerializedName("deaths")
    val deaths:Int,
    @SerializedName("recovered")
    val recovered:Int,
    @SerializedName("date")
    val date: Float,

)
