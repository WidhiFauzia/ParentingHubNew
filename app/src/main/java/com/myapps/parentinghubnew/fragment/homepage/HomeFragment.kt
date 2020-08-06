package com.myapps.parentinghubnew.fragment.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable
import com.google.android.material.chip.ChipGroup
import com.myapps.parentinghubnew.R
import com.myapps.parentinghubnew.adapter.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var kidListAdapter : KidListAdapter
    lateinit var articleCategoryAdapter: ArticleCategoryAdapter
    lateinit var recommendedArticle : RecommendedArticleAdapter
    lateinit var onGoingEventAdapter : OnGoingEventAdapter
    lateinit var popularBrandsAdapter : PopularBrandsAdapter
    lateinit var newestReviewAdapter : NewestReviewAdapter
    lateinit var mostReviewAdapter: MostReviewAdapter
    lateinit var rekomendasiAdapter: RecommendationAdapter
    val listChip = mutableListOf<String>("test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        kidListAdapter = KidListAdapter()
        articleCategoryAdapter = ArticleCategoryAdapter()
        recommendedArticle = RecommendedArticleAdapter()
        onGoingEventAdapter = OnGoingEventAdapter()
        popularBrandsAdapter = PopularBrandsAdapter()
        newestReviewAdapter = NewestReviewAdapter()
        mostReviewAdapter = MostReviewAdapter()
        rekomendasiAdapter = RecommendationAdapter()

        // Initialize a new chip instance
        for(data in listChip){
            addChipToGroup(data, chipgroup1)
//            val chip = Chip(context)
//            chip.text = item
//            chip.isClickable = true
//            chip.isCheckable = false
        }

        // Set the chip click listener
//        chip.setOnClickListener{
//            toast("Clicked: ${chip.text}")
//        }

        rcvKidName.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = kidListAdapter
        }

        rcvArticleCategory.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = articleCategoryAdapter
        }

        rcvArticelForParents.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = recommendedArticle
        }

        rcvEvent.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = onGoingEventAdapter
        }

        rcvBrands.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = popularBrandsAdapter
        }

        rcvNewestReviews.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = newestReviewAdapter
        }

        rcvMostReviews.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = mostReviewAdapter
        }

        rcvRecommendation.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = rekomendasiAdapter
        }
    }

    fun addChipToGroup(data: String, chipGroup: ChipGroup){
        Chip(activity).apply{
            setChipDrawable(
                ChipDrawable.createFromAttributes(context, null, 0, R.style.CustomChipHome)
            )
            setTextColor(ContextCompat.getColorStateList(context, R.color.colorTextGray))
            typeface = ResourcesCompat.getFont(context, R.font.lato_regular)
            text = data
            isClickable = true
            isCheckable = true
        }.let{
            chipGroup.addView(it)
        }
    }
}