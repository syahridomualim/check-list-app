package com.syahrido.mualim.example.checklistapp.data.repository

import com.syahrido.mualim.example.checklistapp.data.UserPreferences
import com.syahrido.mualim.example.checklistapp.data.network.AuthApi
import com.syahrido.mualim.example.checklistapp.model.request.LoginRequest
import com.syahrido.mualim.example.checklistapp.model.request.RegisterRequest

class AuthRepository(
    private val api: AuthApi,
    private val userPreferences: UserPreferences
) : BaseRepository() {

    suspend fun login(loginRequest: LoginRequest) = safeApiCall {
        api.login(loginRequest)
    }

    suspend fun register(registerRequest: RegisterRequest) = safeApiCall {
        api.register(registerRequest)
    }
    suspend fun saveToken(token: String) {
        userPreferences.saveToken(token)
    }

}