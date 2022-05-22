package com.johnlewis.dishwasher.data.response

import com.google.gson.annotations.SerializedName
import com.johnlewis.dishwasher.data.model.Product

data class ProductList(
@SerializedName("products")
val products: List<Product>? = ArrayList()
)
