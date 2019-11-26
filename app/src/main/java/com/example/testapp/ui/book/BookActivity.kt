package com.example.testapp.ui.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.R
import com.example.testapp.utils.GlobaleData
import kotlinx.android.synthetic.main.activity_book.*

class BookActivity : AppCompatActivity() {

    private var bookType : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        getIntentData();

    }

    private fun getIntentData() {
        bookType = intent.getIntExtra(GlobaleData.book_type,0);
        when(bookType){
            1-> {
                pdfView.fromAsset("english_book.pdf").load()
            }
            2-> {
                pdfView.fromAsset("hindi_book.pdf").load()
            }
            3-> {
                pdfView.fromAsset("urdu_book.pdf").load()
            }
        }

    }
}
