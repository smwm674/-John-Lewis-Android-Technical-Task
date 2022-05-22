package com.johnlewis.dishwasher.data.remote

import com.johnlewis.dishwasher.data.constant.URLHelper
import com.johnlewis.dishwasher.data.response.ProductList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AppService {

    @GET(URLHelper.productGrid)
    suspend fun getProductList(@Query("q") query: String, @Query("key") key: String): Response<ProductList>

}