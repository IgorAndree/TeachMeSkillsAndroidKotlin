package com.example.teachmeskillsandroidkotlin.data.repository

import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto
import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemote
import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemoteImpl
import com.example.teachmeskillsandroidkotlin.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsRepositoryImpl @Inject constructor(
    private val postsRemote: PostsRemote
) : PostRepository {
    override fun getPosts(): List<DataPostDto> = PostsRemoteImpl().getPosts()
    override fun getPostInfo(): DataPostDto = PostsRemoteImpl().getPostInfo()
}