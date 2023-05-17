package com.example.teachmeskillsandroidkotlin.domain.repositories

import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto

interface PostRepository {
    suspend fun getPosts(): List<DataPostDto>
}