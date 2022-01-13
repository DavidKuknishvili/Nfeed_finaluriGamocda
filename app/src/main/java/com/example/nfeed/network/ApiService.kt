package com.example.nfeed.network

import com.example.nfeed.model.Model
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("everything?q=tesla&from=2021-12-13&sortBy=publishedAt&apiKey=a7559f027dd24ec4877daae9ac2313fc")
    suspend fun getNews(): Response<Model>
}