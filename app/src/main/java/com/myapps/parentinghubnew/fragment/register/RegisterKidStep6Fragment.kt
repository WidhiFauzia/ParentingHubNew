package com.myapps.parentinghubnew.fragment.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.myapps.parentinghubnew.R
import com.myapps.parentinghubnew.adapter.ViewPager2Adapter
import kotlinx.android.synthetic.main.fragment_register_kid_step6.*

class RegisterKidStep6Fragment : Fragment(R.layout.fragment_register_kid_step6) {

    lateinit var viewpageradapter: ViewPager2Adapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            viewpageradapter = ViewPager2Adapter()

//            viewPagerFeedback.adapter = viewpageradapter

        rcvFeedback.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = viewpageradapter
        }

        btnNext.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep7)
        }

        ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        btnBefore.setOnClickListener {
            findNavController().navigateUp()
        }

    }
}