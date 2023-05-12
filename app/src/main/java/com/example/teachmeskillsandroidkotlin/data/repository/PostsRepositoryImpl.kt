package com.example.teachmeskillsandroidkotlin.data.repository

import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto
import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemoteImpl
import com.example.teachmeskillsandroidkotlin.domain.repositories.PostRepository

class PostsRepositoryImpl : PostRepository {
    override fun getPosts(): List<DataPostDto> = PostsRemoteImpl().getPosts()
    override fun getPostInfo(): DataPostDto = PostsRemoteImpl().getPostInfo()
}