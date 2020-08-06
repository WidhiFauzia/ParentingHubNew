package com.myapps.parentinghubnew.fragment.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.WindowManager
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment(R.layout.fragment_register) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

        ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnRegister.setOnClickListener {
            findNavController().navigate(R.id.actionFormRegister)
        }

        tvTitle5.setOnClickListener {
            findNavController().navigate(R.id.actionLogin);
        }
    }
}