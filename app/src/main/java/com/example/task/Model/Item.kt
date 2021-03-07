package com.example.task.Model

import com.google.gson.annotations.SerializedName

data class Item (
    @SerializedName("category") val category : List<CategoryModel>?,
    @SerializedName("whats_new") val whats_new : List<WhatsNewModel>?,
    @SerializedName("trending") val trending : List<Trending>?,
    @SerializedName("list") val list : List<CategoryModel>?
): baseInfo()