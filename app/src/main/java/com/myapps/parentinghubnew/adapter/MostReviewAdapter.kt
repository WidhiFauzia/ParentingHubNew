package com.myapps.parentinghubnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import androidx.recyclerview.widget.RecyclerView
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.item_most_review.view.*
import kotlinx.android.synthetic.main.item_newest_review.view.*
import kotlinx.android.synthetic.main.item_newest_review.view.rbProductRating

class MostReviewAdapter : RecyclerView.Adapter<MostReviewAdapter.ViewHolder>() {

    var listItem = mutableListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(i: Int) {
            with(itemView) {
                rbProductRating.onRatingBarChangeListener =
                    RatingBar.OnRatingBarChangeListener { p0, p1, p2 ->
                        //Toast.makeText(this@MainActivity, "Given rating is: $p1", Toast.LENGTH_SHORT).show()
                        tvTotalRating.text = p1.toString()
                    }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MostReviewAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_most_review, parent, false))
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: MostReviewAdapter.ViewHolder, position: Int) {
        holder.bindView(listItem[position])
    }


}