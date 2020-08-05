package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step2.*

class RegisterKidStep2Fragment : Fragment(R.layout.fragment_register_kid_step2) {

    var number = 1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        etNumber.setText(number.toString())

        btnAdd.setOnClickListener {
            number += 1
            etNumber.setText(number.toString())
        }

        btnMin.setOnClickListener {
            if(number==1){
                etNumber.setText(number.toString())
            }
            else{
                number -= 1
                etNumber.setText(number.toString())
            }
        }

        ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnBefore.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep2Back)
        }

        btnNext.setOnClickListener {
            var sum = etNumber.text
            //RegisterKidStep2FragmentDirections.actionKidRegisterStep3(params1 = sum)
            findNavController().navigate(R.id.actionKidRegisterStep3)
        }
    }

}