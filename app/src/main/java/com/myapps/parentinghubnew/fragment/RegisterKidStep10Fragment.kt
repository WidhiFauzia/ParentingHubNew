package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step10.*

class RegisterKidStep10Fragment : Fragment(R.layout.fragment_register_kid_step10) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_simpan_email.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep11)
        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}