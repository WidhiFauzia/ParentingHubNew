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
    lateinit var kategoriArtikerlAdapter : KategoriArtikelAdapter
    lateinit var recommendedArtikel : RecommendedArtikelAdapter
    lateinit var acaraberlangsung : OnGoingEventAdapter
    lateinit var brandsAdapter : BrandsTerpopulerAdapter
    lateinit var newestReviewAdapter : NewestReviewAdapter
    lateinit var mostReviewAdapter: MostReviewAdapter
    lateinit var rekomendasiAdapter: RekomendasiAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        kidListAdapter = KidListAdapter()
        kategoriArtikerlAdapter = KategoriArtikelAdapter()
        recommendedArtikel = RecommendedArtikelAdapter()
        acaraberlangsung = OnGoingEventAdapter()
        brandsAdapter = BrandsTerpopulerAdapter()
        newestReviewAdapter = NewestReviewAdapter()
        mostReviewAdapter = MostReviewAdapter()
        rekomendasiAdapter = RekomendasiAdapter()

        rcv_kid_name.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = kidListAdapter
        }

        rcv_kategori_artikel.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = kategoriArtikerlAdapter
        }

        rcv_artikel_untuk_parents.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = recommendedArtikel
        }

        rcv_acara_yang_sedang_berlangsung.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = acaraberlangsung
        }

        rcv_brands.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = brandsAdapter
        }

        rcv_newest_reviews.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = newestReviewAdapter
        }

        rcv_most_reviews.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = mostReviewAdapter
        }

        rcv_rekomendasi.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = rekomendasiAdapter
        }

    }
}