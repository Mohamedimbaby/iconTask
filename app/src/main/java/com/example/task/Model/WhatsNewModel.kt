package com.example.task.Model

import com.google.gson.annotations.SerializedName

data class WhatsNewModel (

    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("price") val price : Int,
    @SerializedName("currency") val currency : String,
    @SerializedName("shop_name") val shop_name : String,
    @SerializedName("image") val image : String,
    @SerializedName("rate") val rate : Double,
    @SerializedName("cat_id") val cat_id : Int,
    @SerializedName("shop_id") val shop_id : Int,
    @SerializedName("isWishList") val isWishList : Int
)