package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R

class KategoriArtikelAdapter : RecyclerView.Adapter<KategoriArtikelAdapter.ViewHolder>() {

    var listTitle = mutableListOf("Semua", "Baby (0-9)", "Toddler", "Lifestyle", "Tips & Trick", "Tutorial")
    var listCoverImage = mutableListOf(R.drawable.ic_thank_you, R.drawable.ic_thank_you, R.drawable.ic_thank_you, R.drawable.ic_thank_you, R.drawable.ic_thank_you, R.drawable.ic_thank_you)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.kategori_title)
        var imageCover = itemView.findViewById<ImageView>(R.id.kategori_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriArtikelAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_kategori_artikel, parent, false))
    }

    override fun getItemCount(): Int {
        return listTitle.size
    }

    override fun onBindViewHolder(holder: KategoriArtikelAdapter.ViewHolder, position: Int) {
        holder.title.text = listTitle[position]
        holder.imageCover.setImageResource(listCoverImage[position])
    }


}