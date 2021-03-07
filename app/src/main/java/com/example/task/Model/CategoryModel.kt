package com.example.task.Model

import com.google.gson.annotations.SerializedName
data class  CategoryModel (
    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("image") val image : String,
    @SerializedName("hasProduct") val hasProduct : String?
)