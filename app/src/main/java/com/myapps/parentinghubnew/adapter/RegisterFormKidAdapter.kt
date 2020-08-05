package com.myapps.parentinghubnew.adapter

import android.app.DatePickerDialog
import android.os.Build
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.item_kid_register.view.*
import java.text.SimpleDateFormat
import java.util.*

class RegisterFormKidAdapter : RecyclerView.Adapter<RegisterFormKidAdapter.ViewHolder>() {

    var listBio = mutableListOf(1,2,3)
    val c = Calendar.getInstance()
    val dateFormatter = SimpleDateFormat("dd MMMM yyyy", Locale.US)
    var spesial = false

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(i: Int) {
            with(itemView) {
                etAbout.setOnTouchListener(View.OnTouchListener { view: View, event: MotionEvent ->
                    if (view.id == R.id.etAbout) {
                        view.parent.requestDisallowInterceptTouchEvent(true)
                        if (event.action and MotionEvent.ACTION_MASK == MotionEvent.ACTION_UP) {
                            view.parent.requestDisallowInterceptTouchEvent(false)
                        }
                    }
                    false
                })

                val year = c.get(Calendar.YEAR)
                val month = c.get(Calendar.MONTH)
                val day = c.get(Calendar.DAY_OF_MONTH)

                etBirth.setOnClickListener {
                    val dpd = DatePickerDialog(
                        context,
                        DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                            // Display Selected date in TextView
                            c.set(year, monthOfYear, dayOfMonth)
                            val formatted = dateFormatter.format(c.time)

                            etBirth.setText(formatted)
                        }, year, month, day)

                    dpd.show()
                }

                cbSpecial.setOnClickListener {
                    spesial = cbSpecial.isChecked
                    if(cbSpecial.isChecked){
                        layoutSpecialNeed.visibility = View.VISIBLE
                    }
                    else{
                        layoutSpecialNeed.visibility = View.GONE
                    }
                }

                ivInfo.setOnClickListener {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        ivInfo.tooltipText = "Apakah si Kecil berkebutuhan khusus?"
                    }
                    else{
                        Toast.makeText(context, "Apakah si Kecil berkebutuhan khusus?", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegisterFormKidAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_kid_register, parent, false))
    }

    override fun getItemCount(): Int {
        return listBio.size
    }

    override fun onBindViewHolder(holder: RegisterFormKidAdapter.ViewHolder, position: Int) {
        holder.bindView(listBio[position])
    }

}