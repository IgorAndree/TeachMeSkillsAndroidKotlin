package com.example.teachmeskillsandroidkotlin.data.remote.dto

import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPostList

data class DataPostDto(
    val id: Int,
    val title: String? = null,
    val description: String? = null
)

fun DataPostDto.toDomainPost() =
    DomainPost(
        id = id,
        title = title,
        description = description
    )

fun List<DataPostDto>.toDomainPostList() =
    DomainPostList(
        this.map {
            it.toDomainPost()
        }
    )