package com.example.teachmeskillsandroidkotlin.domain.repositories

import com.example.teachmeskillsandroidkotlin.data.local.PostEntity
import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto

interface PostRepository {
    suspend fun getPosts(): List<DataPostDto>
    suspend fun getLocalPosts(): List<PostEntity>
    suspend fun getPostInfoFromLocal(): PostEntity?
    suspend fun getLocalRepositoryById(): PostEntity?
}