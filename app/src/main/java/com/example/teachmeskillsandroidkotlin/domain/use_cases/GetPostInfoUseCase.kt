package com.example.teachmeskillsandroidkotlin.domain.use_cases

import com.example.teachmeskillsandroidkotlin.data.remote.dto.toDomainPost
import com.example.teachmeskillsandroidkotlin.data.repository.PostsRepositoryImpl

class GetPostInfoUseCase {
    fun getPostInfo() = PostsRepositoryImpl().getPostInfo().toDomainPost()
}