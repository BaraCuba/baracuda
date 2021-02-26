package com.example.searchingrepository.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class OwnerListItem(

    @SerializedName("login")
    @Expose
    var username: String,

    @SerializedName("repos_ur")
    @Expose
    var url: String


)