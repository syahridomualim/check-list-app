package com.syahrido.mualim.example.checklistapp.data.network

import com.syahrido.mualim.example.checklistapp.model.request.LoginRequest
import com.syahrido.mualim.example.checklistapp.model.request.RegisterRequest
import com.syahrido.mualim.example.checklistapp.model.response.DataToken
import com.syahrido.mualim.example.checklistapp.model.response.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST(value = "login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<DataToken>

    @POST(value = "register")
    suspend fun register(@Body registerRequest: RegisterRequest): Response<*>
}