package com.syahrido.mualim.example.checklistapp.model.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("email")
    @Expose
    val email: String,
    @SerializedName("username")
    @Expose
    val username: String,

    @SerializedName("password")
    @Expose
    val password: String
)
