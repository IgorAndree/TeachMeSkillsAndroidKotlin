package com.example.teachmeskillsandroidkotlin.data.repository

import com.example.teachmeskillsandroidkotlin.data.local.PostEntity
import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto

interface PostsRepository {
    suspend fun getPosts(): List<DataPostDto>?
    suspend fun getLocalPosts(): List<PostEntity>?
    suspend fun getPostInfoFromLocal(): PostEntity?
}