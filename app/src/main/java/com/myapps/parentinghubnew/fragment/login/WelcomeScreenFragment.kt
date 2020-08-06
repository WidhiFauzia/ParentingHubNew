package com.myapps.parentinghubnew.fragment.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import com.myapps.parentinghubnew.fragment.homepage.HomeFragmentDirections
import kotlinx.android.synthetic.main.fragment_welcome_screen.*

class WelcomeScreenFragment : Fragment(R.layout.fragment_welcome_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnWelcome.setOnClickListener {
            findNavController().navigate(R.id.actionLoginFragment)
        }

        btnWelcomeFacebook.setOnClickListener{
            findNavController().navigate(R.id.actionDetailArticle)
        }

        tvTitle5.setOnClickListener {
            findNavController().navigate(R.id.actionRegisterFragment)
        }
    }
}