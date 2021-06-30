package com.example.apptest.Networks

import com.example.apptest.model.Estado
import retrofit2.Call
import retrofit2.http.GET

interface Service {

    @GET("Estado")
    fun callEstado(): Call<List<Estado>>
}