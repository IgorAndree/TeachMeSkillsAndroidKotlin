package com.example.teachmeskillsandroidkotlin.data.repository.remote

import com.example.teachmeskillsandroidkotlin.data.remote.api.PostsApi
import com.example.teachmeskillsandroidkotlin.data.remote.dto.ResponseDto
import javax.inject.Inject

class PostsRemoteImpl @Inject constructor(
    private val postsApi: PostsApi
) : PostsRemote {

    override suspend fun getPosts(): ResponseDto =
        postsApi.getLatestNews()
}