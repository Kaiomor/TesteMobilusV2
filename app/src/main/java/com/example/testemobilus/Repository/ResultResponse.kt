package com.example.testemobilus.Repository

import com.google.gson.annotations.SerializedName

class ResultResponse {

    @SerializedName("id")
    var id :Int =0

    @SerializedName("contry")
    var contry: String = ""

    @SerializedName("contryCode")
    var contryCode: String = ""

    @SerializedName("province")
    var province: String = ""

    @SerializedName("confirmed")
    var confirmed: Int = 0

    @SerializedName("deaths")
    var deaths : Int = 0

    @SerializedName("recovered")
    var recovered: Int = 0

}