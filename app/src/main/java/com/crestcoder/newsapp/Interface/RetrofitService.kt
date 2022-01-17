package com.crestcoder.newsapp.Interface

import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {

//    @GET("movielist.json")
//    fun getAllMovies(): Call<List<NewsItem>>
//
//    companion object {
//        var service: RetrofitService? = null
//
//        fun getInstance(): RetrofitService {
//            if (service == null) {
//                val retrofit = Retrofit.Builder()
//                    .baseUrl("https://howtodoandroid.com/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build()
//                service = retrofit.create(RetrofitService::class.java)
//            }
//            return service!!;
//        }
//    }
}