package com.example.teachmeskillsandroidkotlin.domain.use_cases

import com.example.teachmeskillsandroidkotlin.data.remote.dto.toDomainPost
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost
import com.example.teachmeskillsandroidkotlin.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsUseCase @Inject constructor(
    private val postRepository: PostRepository
) {
    suspend fun getPosts(): List<DomainPost> = postRepository.getPosts().map { postDto ->
        postDto.toDomainPost()
    }
}