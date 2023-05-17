package com.example.teachmeskillsandroidkotlin.data.repository.remote

import com.example.teachmeskillsandroidkotlin.data.remote.dto.ResponseDto

interface PostsRemote {
    suspend fun getPosts(): ResponseDto
}