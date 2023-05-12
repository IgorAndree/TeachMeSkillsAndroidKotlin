package com.example.teachmeskillsandroidkotlin.data.repository

import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto

interface PostsRepository {
    suspend fun getPosts(): List<DataPostDto>
}