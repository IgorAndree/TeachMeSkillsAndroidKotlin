package com.example.teachmeskillsandroidkotlin.domain.use_cases

import com.example.teachmeskillsandroidkotlin.data.remote.dto.toDomainPostList
import com.example.teachmeskillsandroidkotlin.data.repository.PostsRepositoryImpl

class PostsUseCase {
    fun getPosts() = PostsRepositoryImpl().getPosts().toDomainPostList()
}