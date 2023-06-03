package com.example.teachmeskillsandroidkotlin.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost

@Entity
data class PostEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    @ColumnInfo(name = "title")
    val title: String? = null,

    @ColumnInfo(name = "description")
    var description: String? = null,

    @ColumnInfo(name = "url")
    var url: String? = null,

    @ColumnInfo(name = "urlToImage")
    var urlToImage: String? = null,

    @ColumnInfo(name = "publishedAt")
    var publishedAt: String? = null
)

fun PostEntity.toPostsNews() =
    DomainPost(
        title = title,
        description = description,
        urlToImage = urlToImage,
        publishedAt = publishedAt
    )