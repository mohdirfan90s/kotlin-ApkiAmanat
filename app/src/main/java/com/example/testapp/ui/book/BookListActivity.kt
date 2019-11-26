package com.example.testapp.ui.book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.R
import com.example.testapp.utils.GlobaleData
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        btnEnglishABL.setOnClickListener(){
            val intent = Intent(this,BookActivity::class.java)
            intent.putExtra(GlobaleData.book_type,1)
            startActivity(intent)
        }
        btnHindiABL.setOnClickListener(){
            val intent = Intent(this,BookActivity::class.java)
            intent.putExtra(GlobaleData.book_type,2)
            startActivity(intent)
        }
        btnUrduABL.setOnClickListener(){
            val intent = Intent(this,BookActivity::class.java)
            intent.putExtra(GlobaleData.book_type,3)
            startActivity(intent)
        }

    }
}
