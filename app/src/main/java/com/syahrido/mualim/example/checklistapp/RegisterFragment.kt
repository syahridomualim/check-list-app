package com.syahrido.mualim.example.checklistapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.syahrido.mualim.example.checklistapp.base.BaseFragment
import com.syahrido.mualim.example.checklistapp.data.network.AuthApi
import com.syahrido.mualim.example.checklistapp.data.repository.AuthRepository
import com.syahrido.mualim.example.checklistapp.databinding.FragmentRegisterBinding
import com.syahrido.mualim.example.checklistapp.viewmodel.AuthViewModel

class RegisterFragment : BaseFragment<AuthViewModel, FragmentRegisterBinding, AuthRepository>() {

    override fun getViewModel(): Class<AuthViewModel> {
        return AuthViewModel::class.java
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRegisterBinding {
        return FragmentRegisterBinding.inflate(inflater, container, false)
    }

    override fun getFragmentRepository(): AuthRepository {
        return AuthRepository(remoteDataSource.buildApi(AuthApi::class.java), userPreferences)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }
}