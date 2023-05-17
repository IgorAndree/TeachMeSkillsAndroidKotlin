package com.example.teachmeskillsandroidkotlin.data.repository

import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto
import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemote
import com.example.teachmeskillsandroidkotlin.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsRepositoryImpl @Inject constructor(
    private val postsRemote: PostsRemote
) : PostRepository {
    override suspend fun getPosts(): List<DataPostDto> = postsRemote.getPosts().posts.orEmpty()
}