package com.example.teachmeskillsandroidkotlin.data.remote.dto

import com.example.teachmeskillsandroidkotlin.data.local.PostEntity
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost
import com.google.gson.annotations.SerializedName

data class DataPostDto(
    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("urlToImage")
    val urlToImage: String,

    @SerializedName("publishedAt")
    val publishedAt: String
)

fun DataPostDto.toDomainPost() =
    DomainPost(
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt
    )

fun DataPostDto.toLocalPost() =
    PostEntity(
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt
    )