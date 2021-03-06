package com.myapps.parentinghubnew.fragment.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_bottom_nav.*

class BottomNavFragment : Fragment(R.layout.fragment_bottom_nav) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadFragment(HomeFragment())

        navigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_beranda_menu-> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_artikel_menu-> {
                    loadFragment(ArtikelFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_journey_menu-> {
                loadFragment(JourneyFragment())
                return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_profile_menu-> {
                    loadFragment(ProfileFragment())
                    return@setOnNavigationItemSelectedListener true
                }

            }
            false

        }
    }


    private fun loadFragment(fragment: Fragment) {
        // load fragment
        fragmentManager?.beginTransaction()?.replace(R.id.frameContainer, fragment)?.commit()
//        supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container, fragment)
//        transaction.commit()
    }
    }