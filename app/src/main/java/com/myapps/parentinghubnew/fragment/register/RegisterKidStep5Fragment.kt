package com.myapps.parentinghubnew.fragment.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step5.*

class RegisterKidStep5Fragment : Fragment(R.layout.fragment_register_kid_step5) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnNext.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep6)
        }

        btnBefore.setOnClickListener {
            findNavController().navigateUp()
        }

        ivBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}