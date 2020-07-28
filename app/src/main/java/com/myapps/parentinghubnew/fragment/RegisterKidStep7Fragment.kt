package com.myapps.parentinghubnew.fragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step7.*
import kotlinx.android.synthetic.main.pop_up_reminder.view.*

class RegisterKidStep7Fragment : Fragment(R.layout.fragment_register_kid_step7) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_punya_partner.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep8)
        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }

        tv_no.setOnClickListener {
            val mPopUpView = LayoutInflater.from(context).inflate(R.layout.pop_up_terima_kasih, null)
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
            findNavController().navigateUp()
        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}