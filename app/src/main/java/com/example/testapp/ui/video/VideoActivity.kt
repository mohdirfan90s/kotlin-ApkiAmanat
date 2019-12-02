package com.example.testapp.ui.video

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.R

import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView;
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

        btnYoutubeChannel.setOnClickListener {
            val urlYoutube = "https://www.youtube.com/channel/UCjevcnwURum6weHrnkHul4Q"
            val urlYoutubeInApp = "vnd.youtube.com/channel/UCjevcnwURum6weHrnkHul4Q"
            try {
                //here we try to open the link in app
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(urlYoutubeInApp)))
            } catch (e: Exception) {
                //the app isn't available: we open in browser`
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(urlYoutube)))
            }
        }
    }

}
