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

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }

        cv_anak.setOnClickListener {
            cv_anak.setChecked(!cv_anak.isChecked)
        }

        cv_ibu.setOnClickListener {
            cv_ibu.setChecked(!cv_ibu.isChecked)
        }

        cv_program.setOnClickListener {
            cv_program.setChecked(!cv_program.isChecked)
        }

        if(cv_anak.isChecked && cv_ibu.isChecked){
            cv_program.isEnabled = false
            cv_program.isClickable = false
            cv_program.isCheckable = false
            cv_program.isFocusable = false
        }

        btn_selanjutnya.setOnClickListener {
            if(cv_anak.isChecked && cv_ibu.isChecked){
                findNavController().navigate(R.id.actionKidRegisterPregnantAndKid)
            }
            else if(cv_program.isChecked){
                findNavController().navigate(R.id.actionKidRegisterProgram)
            }
        }
    }
}