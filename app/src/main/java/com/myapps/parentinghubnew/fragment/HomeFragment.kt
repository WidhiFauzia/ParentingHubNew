package com.myapps.parentinghubnew.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.myapps.parentinghubnew.R
import com.myapps.parentinghubnew.adapter.KategoriArtikelAdapter
import com.myapps.parentinghubnew.adapter.KidListAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var kidListAdapter : KidListAdapter
    lateinit var kategoriArtikerlAdapter : KategoriArtikelAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        kidListAdapter = KidListAdapter()
        kategoriArtikerlAdapter = KategoriArtikelAdapter()

        rcv_kid_name.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = kidListAdapter
        }

        rcv_kategori_artikel.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = kategoriArtikerlAdapter
        }

    }
}