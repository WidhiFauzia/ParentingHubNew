package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
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
}