package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.item_feedback.view.*

class ViewPager2Adapter : RecyclerView.Adapter<ViewPager2Adapter.Pager2ViewHolder>() {

    var idList = mutableListOf(1,2,3)
    var titleList = mutableListOf("Sangat Tertarik!", "Merasa Kewalahan", "Merasa Kewalahan")
    var imageList = mutableListOf(R.drawable.happy, R.drawable.sad, R.drawable.cool)

    inner class Pager2ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
        val img_feedback = itemView.findViewById<ImageView>(R.id.iv_feedback)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_feedback, parent, false))
    }

    override fun getItemCount(): Int {
        return idList.size
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {
        holder.tv_title.text = titleList[position]
        holder.img_feedback.setImageResource(imageList[position])
    }
}