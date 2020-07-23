package com.myapps.parentinghubnew.fragment

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_register_form.*
import java.text.SimpleDateFormat
import java.util.*

class RegisterFormFragment : Fragment(R.layout.fragment_register_form)  {

    val dateFormatter = SimpleDateFormat("dd MMMM yyyy", Locale.US)
    val c = Calendar.getInstance()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_alamat.setOnTouchListener(OnTouchListener { view: View, event: MotionEvent ->
            if (view.id == R.id.et_alamat) {
                view.parent.requestDisallowInterceptTouchEvent(true)
                if (event.action and MotionEvent.ACTION_MASK == MotionEvent.ACTION_UP) {
                    view.parent.requestDisallowInterceptTouchEvent(false)
                }
            }
            false
        })


        c.add(Calendar.YEAR, -10)
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        et_birth.setOnClickListener {
            val dpd = DatePickerDialog(requireContext(), DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                c.set(year, monthOfYear, dayOfMonth)
                val formatted = dateFormatter.format(c.time)

                et_birth.setText(formatted)
            }, year, month, day)
            dpd.datePicker.setMaxDate(c.timeInMillis)
            dpd.show()

        }

        btn_input_form_register.setOnClickListener {
            findNavController().navigate(R.id.actionKidRegister)
        }

    }
}