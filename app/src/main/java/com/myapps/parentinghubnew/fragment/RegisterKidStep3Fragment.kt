package com.myapps.parentinghubnew.fragment

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step3.*
import kotlinx.android.synthetic.main.pop_up_reminder.view.*

class RegisterKidStep3Fragment : Fragment(R.layout.fragment_register_kid_step3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_selanjutnya.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterForm)
        }

        tv_reminder.setOnClickListener {
            val mPopUpView = LayoutInflater.from(context).inflate(R.layout.pop_up_reminder, null)
            val mPopUpBuilder = AlertDialog.Builder(context,
                R.style.CustomDialog
            )
                .setView(mPopUpView)
            val mAlertDialog = mPopUpBuilder.show()
            mPopUpView.iv_close.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }

        btn_sebelumnya.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep2)
        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }

    }
}