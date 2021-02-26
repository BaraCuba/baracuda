package com.example.searchingrepository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitInstance {

    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Call<String>

}