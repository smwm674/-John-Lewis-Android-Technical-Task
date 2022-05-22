package com.johnlewis.dishwasher.data.model

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("productId")
    val productId: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("variantPriceRange")
    val variantPriceRange: VariantPriceRange
)
