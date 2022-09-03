package com.syahrido.mualim.example.checklistapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.syahrido.mualim.example.checklistapp.model.request.LoginRequest
import com.syahrido.mualim.example.checklistapp.model.response.Response
import com.syahrido.mualim.example.presensiapp.data.network.Resource
import com.syahrido.mualim.example.checklistapp.data.repository.AuthRepository
import kotlinx.coroutines.launch

class AuthViewModel(private val authRepository: AuthRepository) : ViewModel() {

    private val _loginResponse: MutableLiveData<Resource<Response>> =
        MutableLiveData()
    val token: LiveData<Resource<Response>>
        get() = _loginResponse

    fun login(loginRequest: LoginRequest) {
        viewModelScope.launch {
            _loginResponse.value = authRepository.login(loginRequest)
        }
    }

    fun saveLoginResponse(token: String) {
        viewModelScope.launch {
            authRepository.saveToken(token)
        }
    }
}