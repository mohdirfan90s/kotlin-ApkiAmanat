package com.example.testapp.ui.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.R
import com.example.testapp.utils.GlobaleData

class BookActivity : AppCompatActivity() {

    private var bookType : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        getIntentData();
    }

    private fun getIntentData() {
        bookType = intent.getIntExtra(GlobaleData.book_type,0);

    }
}
