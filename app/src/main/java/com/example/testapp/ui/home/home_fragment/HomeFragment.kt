package com.example.testapp.ui.home.home_fragment

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.testapp.R
import com.example.testapp.ui.book.BookActivity
import com.example.testapp.ui.book.BookListActivity
import com.example.testapp.ui.quran.QuranActivity
import com.example.testapp.ui.video.VideoActivity
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel

        ivBookHOME.setOnClickListener(){
            val intent = Intent(activity, BookListActivity::class.java)
            startActivity(intent)
        }

        ivVidoesHOME.setOnClickListener(){
            val intent = Intent(activity, VideoActivity::class.java)
            startActivity(intent)
        }

        ivQuranHOME.setOnClickListener(){
            val intent = Intent(activity, QuranActivity::class.java)
            startActivity(intent)
        }
    }

}
