package com.example.testemobilus.Repository

import retrofit2.Call
import retrofit2.http.GET

interface Service {

    @GET("Total")
    fun list (): Call<List<ResultResponse>>

}