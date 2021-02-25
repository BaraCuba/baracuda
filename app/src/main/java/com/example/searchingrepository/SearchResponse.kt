package com.example.searchingrepository

class SearchResponse {
    data class User(
            val login: String,
            val name: String,
            val updated_at: String,
            val repos_url:String
    )
    data class Result (val items: List<User>)
}