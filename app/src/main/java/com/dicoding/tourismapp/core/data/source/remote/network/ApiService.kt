package com.dicoding.tourismapp.core.data.source.remote.network

import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import io.reactivex.Flowable
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    //hapus call, tambahkan suspend karena retrofit sudah support Flow
    @GET("list")
    suspend fun getList(): ListTourismResponse
}