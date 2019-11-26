package com.example.mvvm_demo.data.network

import android.content.Context
import android.net.ConnectivityManager
import com.example.mvvm_demo.utils.NoInternetException
import com.example.mvvm_new.utils.GlobalMethods
import okhttp3.Interceptor
import okhttp3.Response

class NetworkConnectionInterceptor (context : Context): Interceptor {

    private val applicationContext = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {
        if(!GlobalMethods.isInternetAvailable(applicationContext)){
            throw NoInternetException("No Internet Connection")
        }
        return chain.proceed(chain.request())
    }
}