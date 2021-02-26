package com.example.searchingrepository.models

import com.example.searchingrepository.models.Users
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitInstanceApi {

    @GET("search/repositories")
    fun getListUser(): Single<Users>

}