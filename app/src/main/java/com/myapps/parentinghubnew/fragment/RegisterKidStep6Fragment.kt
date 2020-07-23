package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import com.myapps.parentinghubnew.adapter.ViewPager2Adapter
import kotlinx.android.synthetic.main.fragment_register_kid_step6.*

class RegisterKidStep6Fragment : Fragment(R.layout.fragment_register_kid_step6) {

    lateinit var viewpageradapter: ViewPager2Adapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            viewpageradapter = ViewPager2Adapter()

            viewPagerFeedback.adapter = viewpageradapter

        btn_selanjutnya.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep7)
        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }

    }
}