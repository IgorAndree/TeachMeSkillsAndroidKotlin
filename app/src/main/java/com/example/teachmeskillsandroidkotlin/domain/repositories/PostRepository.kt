package com.example.teachmeskillsandroidkotlin.domain.repositories

import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto

interface PostRepository {
    fun getPosts(): List<DataPostDto>
    fun getPostInfo(): DataPostDto
}