package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R

class RecommendedArticelAdapter : RecyclerView.Adapter<RecommendedArticelAdapter.ViewHolder>() {

    var listArtikel = mutableListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(i: Int) {
            with(itemView) {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendedArticelAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_artikel_untuk_parents, parent, false))
    }

    override fun getItemCount(): Int {
        return listArtikel.size
    }

    override fun onBindViewHolder(holder: RecommendedArticelAdapter.ViewHolder, position: Int) {
        holder.bindView(listArtikel[position])
    }


}