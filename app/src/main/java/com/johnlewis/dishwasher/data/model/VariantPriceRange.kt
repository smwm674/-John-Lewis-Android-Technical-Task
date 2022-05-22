package com.johnlewis.dishwasher.data.model

import com.google.gson.annotations.SerializedName

data class VariantPriceRange(
    @SerializedName("display")
    val display: Display
)
