package com.example.teachmeskillsandroidkotlin.domain.use_cases

import com.example.teachmeskillsandroidkotlin.data.local.toPostsNews
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost
import com.example.teachmeskillsandroidkotlin.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetPostInfoUseCase @Inject constructor
    (
    private val postRepository: PostRepository
) {
    suspend fun getPostInfoById(): DomainPost? =
        postRepository.getLocalRepositoryById()?.toPostsNews()
}



