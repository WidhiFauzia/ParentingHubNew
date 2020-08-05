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

        btnBefore.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterBack)
        }

        ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        cvMom.setOnClickListener {
            cvMom.setChecked(!cvMom.isChecked)
        }

        cvPregnant.setOnClickListener {
            cvPregnant.setChecked(!cvPregnant.isChecked)
        }

        cvProgram.setOnClickListener {
            cvProgram.setChecked(!cvProgram.isChecked)
        }

        if(cvMom.isChecked && cvPregnant.isChecked){
            cvProgram.isEnabled = false
            cvProgram.isClickable = false
            cvProgram.isCheckable = false
            cvProgram.isFocusable = false
        }

        btnNext.setOnClickListener {
            if(cvMom.isChecked && cvPregnant.isChecked){
                findNavController().navigate(R.id.actionKidRegisterPregnantAndKid)
            }
            else if(cvProgram.isChecked){
                findNavController().navigate(R.id.actionKidRegisterProgram)
            }
        }
    }
}