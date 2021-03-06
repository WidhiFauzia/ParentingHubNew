package com.myapps.parentinghubnew.fragment.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.WindowManager
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

        ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        tvTitle5.setOnClickListener {
            findNavController().navigate(R.id.actionLoginRegisterFragment)
        }

        btnLogin.setOnClickListener {
            findNavController().navigate(R.id.actionHome)
        }
    }
}