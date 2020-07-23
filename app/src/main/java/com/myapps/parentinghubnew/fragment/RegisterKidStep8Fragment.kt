package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step8.*

class RegisterKidStep8Fragment : Fragment(R.layout.fragment_register_kid_step8) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_simpan_data.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep9)
        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}