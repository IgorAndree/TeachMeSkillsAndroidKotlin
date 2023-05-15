package com.example.teachmeskillsandroidkotlin.domain.use_cases

import com.example.teachmeskillsandroidkotlin.data.remote.dto.toDomainPostList
import com.example.teachmeskillsandroidkotlin.data.repository.PostsRepositoryImpl
import com.example.teachmeskillsandroidkotlin.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsUseCase @Inject constructor(
    private val postRepository: PostRepository
) {
    fun getPosts() = postRepository.getPosts().toDomainPostList()
}