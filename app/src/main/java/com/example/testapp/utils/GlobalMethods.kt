package com.example.mvvm_new.utils

import android.content.Context
import android.net.ConnectivityManager

class GlobalMethods {
    companion object {
        fun isInternetAvailable(context: Context): Boolean {
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE)
                        as ConnectivityManager
            connectivityManager.activeNetworkInfo.also {
                return it != null && it.isConnected
            }
        }
    }
}