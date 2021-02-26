package com.example.searchingrepository

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class Users {


    @SerializedName("name")
    @Expose
    open var name: String? = null

    @SerializedName("login")
    @Expose
    open var login: String? = null

    @SerializedName("repos_ur")
    @Expose
    open var repos_ur: String? = null

    @SerializedName("updated_at")
    @Expose
    open var updated_at: String? = null


}