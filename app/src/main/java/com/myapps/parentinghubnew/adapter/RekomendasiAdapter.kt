package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.item_newest_review.view.*

class RekomendasiAdapter : RecyclerView.Adapter<RekomendasiAdapter.ViewHolder>() {

    var listItem = mutableListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(i: Int) {
            with(itemView) {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RekomendasiAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rekomendasi, parent, false))
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: RekomendasiAdapter.ViewHolder, position: Int) {
        holder.bindView(listItem[position])
    }


}