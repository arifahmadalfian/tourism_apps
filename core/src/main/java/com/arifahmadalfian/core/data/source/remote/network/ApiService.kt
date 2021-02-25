package com.arifahmadalfian.core.data.source.remote.network

import com.arifahmadalfian.core.data.source.remote.response.ListTourismResponse
import retrofit2.http.GET

interface ApiService {
    //hapus call, tambahkan suspend karena retrofit sudah support Flow
    @GET("list")
    suspend fun getList(): ListTourismResponse
}