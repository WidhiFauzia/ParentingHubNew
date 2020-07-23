package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_welcome_screen.*

class WelcomeScreenFragment : Fragment(R.layout.fragment_welcome_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_masuk.setOnClickListener {
            findNavController().navigate(R.id.actionLoginFragment)
        }

        tv_title5.setOnClickListener {
            findNavController().navigate(R.id.actionRegisterFragment)
        }
    }
}