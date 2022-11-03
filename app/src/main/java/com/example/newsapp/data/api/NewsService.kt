package com.example.newsapp.data.api

import com.example.newsapp.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.newsapp.utils.Constants.Companion.API_KEY

interface NewsService {

    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") API_KEY: String = Constants.API_KEY
    )


    suspend fun geHeadlines(
        @Query("country") countryCode: String = "ru",
        @Query("page") page: Int = 1,
        @Query("apiKey") API_KEY: String = Constants.API_KEY
    )
}