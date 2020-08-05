package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R

class ArticleCategoryAdapter : RecyclerView.Adapter<ArticleCategoryAdapter.ViewHolder>() {

    var listTitle = mutableListOf("Semua", "Baby (0-9)", "Toddler", "Lifestyle", "Tips & Trick", "Tutorial")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.tvTitleCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleCategoryAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_article_category, parent, false))
    }

    override fun getItemCount(): Int {
        return listTitle.size
    }

    override fun onBindViewHolder(holder: ArticleCategoryAdapter.ViewHolder, position: Int) {
        holder.title.text = listTitle[position]
    }


}