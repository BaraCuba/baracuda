package com.example.searchingrepository.models

import android.content.DialogInterface
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Users (val items: List<ListItem>)

    data class ListItem(

        @SerializedName("name")
        @Expose
         var namerepo: String,

        @SerializedName("owner")
        @Expose
         var items: List<DialogInterface>,

        @SerializedName("updated_at")
        @Expose
        var commit: String
    )
