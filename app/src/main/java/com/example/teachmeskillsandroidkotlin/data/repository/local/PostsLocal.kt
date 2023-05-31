package com.example.teachmeskillsandroidkotlin.data.repository.local

import com.example.teachmeskillsandroidkotlin.data.local.PostEntity

interface PostsLocal {
    suspend fun getLocalPosts(): List<PostEntity>?

    suspend fun insertPost(post: PostEntity)

    suspend fun deletePost(post: PostEntity)

    suspend fun updatePost(post: PostEntity)
}