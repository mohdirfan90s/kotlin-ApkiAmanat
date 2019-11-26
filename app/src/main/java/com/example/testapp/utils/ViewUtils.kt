package com.example.mvvm_demo.utils

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast

fun Context.toast(message:String){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}

fun ProgressBar.show(){
    visibility = View.VISIBLE
}

fun ProgressBar.hide(){
    visibility = View.GONE
}

fun View.showShanckBar(message : String){
//    Snackbar.make(this,message,Snackbar.LENGTH_LONG).also { snackbar ->
//        snackbar.setAction("Okay"){
//            snackbar.dismiss()
//        }
//    }.show()
}