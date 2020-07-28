package com.myapps.parentinghubnew.fragment

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_kid_step4.*
import kotlinx.android.synthetic.main.item_kid_register.view.*
import java.text.SimpleDateFormat
import java.util.*

class RegisterKidStep4Fragment : Fragment(R.layout.fragment_register_kid_step4) {

    val c = Calendar.getInstance()
    val dateFormatter = SimpleDateFormat("dd MMMM yyyy", Locale.US)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }

        btn_simpan.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegisterStep5)
        }

        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        et_prediksiLahir.setOnClickListener {
            val dpd = DatePickerDialog(requireContext(), DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    // Display Selected date in TextView
                    c.set(year, monthOfYear, dayOfMonth)
                    val formatted = dateFormatter.format(c.time)

                    et_prediksiLahir.setText(formatted)
                }, year, month, day)

            dpd.show()
        }

        btn_sebelumnya.setOnClickListener {
            findNavController().navigateUp()
        }

        iv_back.setOnClickListener {
            findNavController().navigateUp()
        }

    }
}