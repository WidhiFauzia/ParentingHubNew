package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R

class KidListAdapter : RecyclerView.Adapter<KidListAdapter.ViewHolder>() {

    var listNama = mutableListOf("Ke-23", "Jessy", "Jaden")
    var listAvatar = mutableListOf(R.drawable.ic_baby_girl, R.drawable.ic_girl, R.drawable.ic_boy)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nama = itemView.findViewById<TextView>(R.id.tvName)
        var avatar = itemView.findViewById<ImageView>(R.id.kidAvatar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KidListAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_kid, parent, false))
    }

    override fun getItemCount(): Int {
        return listNama.size
    }

    override fun onBindViewHolder(holder: KidListAdapter.ViewHolder, position: Int) {
        holder.nama.text = listNama[position]
        holder.avatar.setImageResource(listAvatar[position])
    }
}