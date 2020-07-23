package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step1.*

class RegisterKidStep1Fragment : Fragment(R.layout.fragment_register_kid_step1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_sebelumnya.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterBack)
        }

        btn_selanjutnya.setOnClickListener {

        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }

        cv_anak.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterPregnantAndKid)
        }

        cv_ibu.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterPregnantAndKid)
        }

        cv_program.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterProgram)
        }
    }
}