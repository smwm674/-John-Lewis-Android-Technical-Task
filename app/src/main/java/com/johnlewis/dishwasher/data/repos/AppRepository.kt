package com.johnlewis.dishwasher.data.repos

import com.johnlewis.dishwasher.data.remote.RemoteDataSource
import com.johnlewis.dishwasher.utils.NetworkOnly
import javax.inject.Inject

class AppRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) {
    fun getProductList(query: String,key: String) = NetworkOnly(
        networkCall = { remoteDataSource.getProductList(query,key) }
    )
}