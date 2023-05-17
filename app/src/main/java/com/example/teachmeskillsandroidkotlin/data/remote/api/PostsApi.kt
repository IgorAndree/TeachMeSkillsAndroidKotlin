package com.example.teachmeskillsandroidkotlin.data.remote.api

import com.example.teachmeskillsandroidkotlin.data.remote.dto.ResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface PostsApi {
    companion object {
        const val GET_POSTS_REQUEST = "top-headlines"
        const val SOURCE_PARAM = "sources"
        const val KEY_PARAM = "apiKey"
        const val API_KEY = "098fd2bbf0d2460e9786a1216e155b3a"
        const val SOURCE_CONST = "techcrunch"
    }

    @GET(GET_POSTS_REQUEST)
    suspend fun getLatestNews(
        @Query(SOURCE_PARAM) source: String = SOURCE_CONST,
        @Query(KEY_PARAM) apiKey: String = API_KEY
    ): ResponseDto
}