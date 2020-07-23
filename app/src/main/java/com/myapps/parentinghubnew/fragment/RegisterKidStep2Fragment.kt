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

        et_number.setText(number.toString())

        btn_add.setOnClickListener {
            number += 1
            et_number.setText(number.toString())
        }

        btn_min.setOnClickListener {
            if(number==0){
                et_number.setText(number.toString())
            }
            else{
                number -= 1
                et_number.setText(number.toString())
            }
        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }

        btn_sebelumnya.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep2Back)
        }

        btn_selanjutnya.setOnClickListener {
            var sum = et_number.text
            //RegisterKidStep2FragmentDirections.actionKidRegisterStep3(params1 = sum)
            findNavController().navigate(R.id.actionKidRegisterStep3)
        }
    }

}