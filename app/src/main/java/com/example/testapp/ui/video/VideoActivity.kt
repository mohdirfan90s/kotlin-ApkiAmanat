package com.example.testapp.ui.video

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvm_demo.utils.toast
import com.example.testapp.R
import com.google.android.youtube.player.*

import kotlinx.android.synthetic.main.activity_video.*

//class VideoActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

class VideoActivity : AppCompatActivity() {

//    override fun onInitializationSuccess(
//        provider: YouTubePlayer.Provider?,
//        player: YouTubePlayer?,
//        wasRestored: Boolean
//    ) {
//        toast("Youtube Api Initialization Success")
//        if (!wasRestored) {
//            player?.cueVideo("57YjbMStSUk");
//        }
//    }
//
//    override fun onInitializationFailure(
//        p0: YouTubePlayer.Provider?,
//        p1: YouTubeInitializationResult?
//    ) {
//        toast("Youtube Api Initialization Failure")
//    }
//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        setYoutubeData()
        setClickListner()
    }

    private fun setClickListner() {
        btnMoreVideosVA.setOnClickListener {
            val urlYoutube = "https://www.youtube.com/channel/UCjevcnwURum6weHrnkHul4Q"
            val urlYoutubeInApp = "vnd.youtube.com/channel/UCjevcnwURum6weHrnkHul4Q"
            try {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(urlYoutubeInApp)))
            } catch (e: Exception) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(urlYoutube)))
            }
        }
    }

    private fun setYoutubeData() {
//        videoOneVA.initialize("AIzaSyBrFISewnoB1y9qtOvBOuXSGfdjruOmUJM", this)
//        videoTwoVA.initialize("AIzaSyBrFISewnoB1y9qtOvBOuXSGfdjruOmUJM", this)
//        videoThreeVA.initialize("AIzaSyBrFISewnoB1y9qtOvBOuXSGfdjruOmUJM", this)
    }

}
