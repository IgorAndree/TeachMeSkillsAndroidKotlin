package com.example.teachmeskillsandroidkotlin.domain.use_cases

import com.example.teachmeskillsandroidkotlin.data.remote.dto.toDomainPost
import com.example.teachmeskillsandroidkotlin.data.repository.PostsRepository
import com.example.teachmeskillsandroidkotlin.data.repository.PostsRepositoryImpl
import com.example.teachmeskillsandroidkotlin.domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetPostInfoUseCase @Inject constructor(
    private val postRepository: PostRepository
) {
    fun getPostInfo() = postRepository.getPostInfo().toDomainPost()
}