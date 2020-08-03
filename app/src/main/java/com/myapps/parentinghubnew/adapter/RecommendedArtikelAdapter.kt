package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R

class RecommendedArtikelAdapter : RecyclerView.Adapter<RecommendedArtikelAdapter.ViewHolder>() {

    var listArtikel = mutableListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(i: Int) {
            with(itemView) {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendedArtikelAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_artikel_untuk_parents, parent, false))
    }

    override fun getItemCount(): Int {
        return listArtikel.size
    }

    override fun onBindViewHolder(holder: RecommendedArtikelAdapter.ViewHolder, position: Int) {
        holder.bindView(listArtikel[position])
    }


}