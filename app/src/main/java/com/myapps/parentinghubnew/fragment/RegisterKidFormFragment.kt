package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.myapps.parentinghubnew.R
import com.myapps.parentinghubnew.adapter.RegisterFormKidAdapter
import kotlinx.android.synthetic.main.fragment_register_kid_form.*

class RegisterKidFormFragment : Fragment(R.layout.fragment_register_kid_form) {

    lateinit var registerKidFormAdapter: RegisterFormKidAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registerKidFormAdapter = RegisterFormKidAdapter()

        rcvFormBio.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = registerKidFormAdapter
        }

        btnSave.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep4)
        }

        ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnBefore.setOnClickListener {
            findNavController().navigateUp()
        }

    }
}