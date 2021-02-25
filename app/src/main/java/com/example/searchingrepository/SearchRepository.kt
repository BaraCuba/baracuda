package com.example.searchingrepository

import io.reactivex.Observable
import kotlin.Result as Result1

class SearchRepository(val apiService: GithubApiService) {
    fun searchUsers(location: String, language: String): Observable<Result1> {
        return apiService.search(query = "location:$location+language:$language")
    }
}