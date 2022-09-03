package com.syahrido.mualim.example.checklistapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.syahrido.mualim.example.checklistapp.data.repository.AuthRepository
import com.syahrido.mualim.example.checklistapp.data.repository.BaseRepository

@Suppress("UNCHECKED_CAST")
class AuthViewModelFactory(private val repository: BaseRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> {
                AuthViewModel(repository as AuthRepository) as T
            }

            else -> {
                throw IllegalArgumentException("ViewModel Not Found")
            }
        }
    }
}