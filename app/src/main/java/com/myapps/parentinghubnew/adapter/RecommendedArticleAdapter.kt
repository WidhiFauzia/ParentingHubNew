package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R
import com.myapps.parentinghubnew.fragment.homepage.HomeFragmentDirections
import kotlinx.android.synthetic.main.item_article_for_parents.view.*

class RecommendedArticleAdapter : RecyclerView.Adapter<RecommendedArticleAdapter.ViewHolder>() {

    var listArtikel = mutableListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(i: Int) {
            with(itemView) {
                setOnClickListener {
                    findNavController().navigate(HomeFragmentDirections.actionDetailArticle())
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendedArticleAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_article_for_parents, parent, false))
    }

    override fun getItemCount(): Int {
        return listArtikel.size
    }

    override fun onBindViewHolder(holder: RecommendedArticleAdapter.ViewHolder, position: Int) {
        holder.bindView(listArtikel[position])
    }

}