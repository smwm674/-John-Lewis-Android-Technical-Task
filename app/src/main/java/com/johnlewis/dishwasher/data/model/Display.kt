package com.johnlewis.dishwasher.data.model

import com.google.gson.annotations.SerializedName

data class Display(
    @SerializedName("max")
    val max: Float,
    @SerializedName("min")
    val min: Float
)
