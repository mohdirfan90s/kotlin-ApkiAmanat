package com.example.testapp.ui.video


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.R

import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView;
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    override fun onInitializationSuccess(provider: YouTubePlayer.Provider?, player: YouTubePlayer?, wasRestored: Boolean) {
        showShortToast("Youtube Api Initialization Success")
        if (!wasRestored) {
            player?.cueVideo("57YjbMStSUk");
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
        showShortToast("Youtube Api Initialization Failure")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        yt_video1.initialize("AIzaSyBrFISewnoB1y9qtOvBOuXSGfdjruOmUJM", this)
        /*yt_video2.initialize("AIzaSyBrFISewnoB1y9qtOvBOuXSGfdjruOmUJM", this)
        yt_video3.initialize("AIzaSyBrFISewnoB1y9qtOvBOuXSGfdjruOmUJM", this)*/
    }


}
