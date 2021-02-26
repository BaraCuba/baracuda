package com.example.searchingrepository

import android.app.Application
import com.example.searchingrepository.models.RetrofitInstanceApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

class DataRepositoryApp : Application() {

    lateinit var dataRepo : RetrofitInstanceApi

        override fun onCreate() {
            super.onCreate()
            configureRetrofit()
        }

        private fun configureRetrofit(){

            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            var okHttpClient = OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build()

            var retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

            dataRepo = retrofit.create(RetrofitInstanceApi::class.java)

        }
}

