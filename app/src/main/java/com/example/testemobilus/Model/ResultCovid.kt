package com.example.testemobilus.Model

data class ResultCovid(
    val id: Int,
    val country: String,
    val province: List<String>,
    val confirmed: Int,
    val deaths: Int,
    val recovered: Int,

    )



