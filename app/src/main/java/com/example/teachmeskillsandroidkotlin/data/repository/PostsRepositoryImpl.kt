package com.example.teachmeskillsandroidkotlin.data.repository

import com.example.teachmeskillsandroidkotlin.data.local.PostEntity
import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto
import com.example.teachmeskillsandroidkotlin.data.remote.dto.toLocalPost
import com.example.teachmeskillsandroidkotlin.data.repository.local.PostsLocal
import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemote
import com.example.teachmeskillsandroidkotlin.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsRepositoryImpl @Inject constructor(
    private val postsRemote: PostsRemote,
    private val postsLocal: PostsLocal
) : PostRepository {
    override suspend fun getPosts(): List<DataPostDto> {
        val postList = postsRemote.getPosts().posts.orEmpty()

        if (postList.isNotEmpty()) {
            postList.forEach { postDto ->
                postsLocal.insertPost(post = postDto.toLocalPost())
            }
        }

        return postList
    }

    override suspend fun getLocalPosts(): List<PostEntity> = postsLocal.getLocalPosts().orEmpty()
    override suspend fun getPostInfoFromLocal(): PostEntity? {
        return null
    }

    override suspend fun getLocalRepositoryById(): PostEntity? =
        postsLocal.getById(3)
}
