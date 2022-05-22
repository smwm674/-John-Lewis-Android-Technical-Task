package com.johnlewis.dishwasher.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val appService: AppService
) : BaseDataSource() {

    suspend fun getProductList(query: String,key: String) =
        getResult { appService.getProductList(query,key) }
}