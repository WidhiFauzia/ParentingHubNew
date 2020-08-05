package com.myapps.parentinghubnew.fragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_kid_register_confirm.*
import kotlinx.android.synthetic.main.pop_up_reminder.view.*

class RegisterKidConfirmFragment : Fragment(R.layout.fragment_kid_register_confirm) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnYes.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep1)
        }

        btnRemindMe.setOnClickListener {
            val mPopUpView = LayoutInflater.from(context).inflate(R.layout.pop_up_reminder, null)
            val mPopUpBuilder = AlertDialog.Builder(context,
                R.style.CustomDialog
            )
                .setView(mPopUpView)
            val mAlertDialog = mPopUpBuilder.show()
            mPopUpView.ivClose.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
    }
}