package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R

class BrandsTerpopulerAdapter : RecyclerView.Adapter<BrandsTerpopulerAdapter.ViewHolder>() {

    var listItem = mutableListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(i: Int) {
            with(itemView) {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandsTerpopulerAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_brands, parent, false))
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: BrandsTerpopulerAdapter.ViewHolder, position: Int) {
        holder.bindView(listItem[position])
    }


}