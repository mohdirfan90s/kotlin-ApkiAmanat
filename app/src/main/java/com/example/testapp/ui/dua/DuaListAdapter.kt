package com.example.testapp.ui.dua

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R

class DuaListAdapter (private val alDuaList: List<String>, private val context: Context) :
    RecyclerView.Adapter<DuaListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_dua_list, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return alDuaList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvProductNameViewCartAdapter.text = alDuaList.get(position)
        holder.rootDuaListAdapter.setOnClickListener(){
            val intent = Intent(context, DuaDetails::class.java)
            context.startActivity(intent)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvProductNameViewCartAdapter =  itemView.findViewById(R.id.tvDuasList) as TextView
        val rootDuaListAdapter = itemView.findViewById(R.id.rootDuaListAdapter) as LinearLayout



    }
}