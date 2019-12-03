package com.example.testapp.ui.dua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapp.R
import kotlinx.android.synthetic.main.activity_dua.*

class DuaActivity : AppCompatActivity() {

    private var alDualList : ArrayList<String> = arrayListOf();
    private var duaListAdapter : DuaListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)

        setClickListner()
        setData()
    }

    private fun setData() {
        loadArray()
        setRecyclerView()
    }

    private fun setClickListner() {
        ivBackDuaA.setOnClickListener(){
            finish()
        }
    }

    private fun setRecyclerView() {
        rvDuas.setHasFixedSize(true)
        rvDuas.layoutManager = LinearLayoutManager(this)
        duaListAdapter = DuaListAdapter(alDualList, this)
        rvDuas.adapter = duaListAdapter
    }

    private fun loadArray() {
        alDualList.add("Dua One")
        alDualList.add("Dua Two")
        alDualList.add("Dua Three")
        alDualList.add("Dua Four")

    }
}
