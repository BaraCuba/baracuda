package com.example.searchingrepository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


    object DataRepository {
        fun create(): RetrofitInstance {
            val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://github.com")
                    .build()
            return retrofit.create(RetrofitInstance::class.java)
        }
    }
