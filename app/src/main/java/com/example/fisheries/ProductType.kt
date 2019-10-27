package com.example.fisheries

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProductType {
    @SerializedName("product")
    @Expose
    var product: Int? = null
    @SerializedName("category")
    @Expose
    var category: Int? = null
}