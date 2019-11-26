package com.example.mvvm_demo.data.network

import com.google.gson.JsonObject
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface MyApi {


//    @FormUrlEncoded
//    @POST("Login")
//    fun login(
//        @Field("name") name :String,
//        @Field("password")password :String) : Call<ResponseBody>


    companion object{
        operator fun invoke(networkConnectionInterceptor: NetworkConnectionInterceptor
        ) : MyApi{

            val okHttpClient = OkHttpClient.Builder().addInterceptor(networkConnectionInterceptor).build() // Used to check internet connections.

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(WebFields.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MyApi::class.java)
        }
    }
}