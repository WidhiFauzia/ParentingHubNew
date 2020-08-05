package com.myapps.parentinghubnew.fragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step9.*
import kotlinx.android.synthetic.main.pop_up_reminder.view.*

class RegisterKidStep9Fragment : Fragment(R.layout.fragment_register_kid_step9) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSure.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep10)
        }

        ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        tvNo.setOnClickListener {
            val mPopUpView = LayoutInflater.from(context).inflate(R.layout.pop_up_thank_you, null)
            val mPopUpBuilder = AlertDialog.Builder(context,
                R.style.CustomDialog
            )
                .setView(mPopUpView)
            val mAlertDialog = mPopUpBuilder.show()
            mPopUpView.ivClose.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }

        btnBefore.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}