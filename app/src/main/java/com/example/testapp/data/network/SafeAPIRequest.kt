package com.example.mvvm_demo.data.network

import com.example.mvvm_demo.utils.ApiExceptions
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Response

abstract class SafeAPIRequest {
    suspend fun <T : Any> apiRequest(call : suspend () -> Response<T>) : T{
        val response = call.invoke()
        if(response.isSuccessful){
            return response.body()!!
        }else{
            val error = response.errorBody()?.string()
            val message = StringBuffer()
            error.let {
                try {
                    message.append(JSONObject(it).getString(WebFields.RESPONSE_MESSAGE))
                }catch (e : JSONException){

                }
                message.append("\n")
                message.append("Error code ${response.code()}")
                throw ApiExceptions(message.toString())
            }
        }
    }
}