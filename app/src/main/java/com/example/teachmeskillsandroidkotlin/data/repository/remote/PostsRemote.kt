package com.example.teachmeskillsandroidkotlin.data.repository.remote

import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto

interface PostsRemote {
    fun getPosts(): List<DataPostDto>
    fun getPostInfo(): DataPostDto
}