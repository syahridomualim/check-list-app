package com.syahrido.mualim.example.checklistapp.model.response

import com.google.gson.annotations.SerializedName

data class Response(

    @field:SerializedName("statusCode")
    val statusCode: Int? = null,

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("errorMessage")
    val errorMessage: Any? = null,

    @field:SerializedName("data")
    val data: DataToken? = null
)