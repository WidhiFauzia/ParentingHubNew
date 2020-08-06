package com.myapps.parentinghubnew.fragment.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import com.myapps.parentinghubnew.R
import kotlinx.android.synthetic.main.fragment_detail_article.*

class DetailArticleFragment : Fragment(R.layout.fragment_detail_article) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        wvArticle.loadUrl("https://medium.com/@arifaizin/cara-simpel-membuat-webview-di-android-studio-a38a081bf6a0")

        ivMenu.setOnClickListener {

            val popup = PopupMenu(context, ivMenu)
            //Inflating the Popup using xml file
            popup.menuInflater.inflate(R.menu.article_pop_up_menu, popup.menu)


            popup.setOnMenuItemClickListener {
                if (it.itemId == R.id.report) {
                    Toast.makeText(context, "Laporkan", Toast.LENGTH_SHORT).show()
                }
                else if (it.itemId == R.id.save) {
                    Toast.makeText(context, "Save", Toast.LENGTH_SHORT).show()
                }
                else if (it.itemId == R.id.follow) {
                    Toast.makeText(context, "Follow", Toast.LENGTH_SHORT).show()
                }
                else if (it.itemId == R.id.notification) {
                    Toast.makeText(context, "Notification", Toast.LENGTH_SHORT).show()
                }
                else if (it.itemId == R.id.copyLink) {
                    Toast.makeText(context, "Copy Link", Toast.LENGTH_SHORT).show()
                }
                else if (it.itemId == R.id.share) {
                    Toast.makeText(context, "Share", Toast.LENGTH_SHORT).show()
                }
                true
            }

            popup.show()//showing popup menu

        }

    }
}