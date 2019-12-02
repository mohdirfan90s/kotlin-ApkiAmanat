package com.example.testapp.ui.video


import android.content.Context
import android.widget.Toast

/**
 * Created by irfan
 * on 02-Dec-2019.
 */
fun Context.showShortToast(message: CharSequence) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.showLongToast(message: CharSequence) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}