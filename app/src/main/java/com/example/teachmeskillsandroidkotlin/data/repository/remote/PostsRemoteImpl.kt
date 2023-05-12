package com.example.teachmeskillsandroidkotlin.data.repository.remote

import com.example.teachmeskillsandroidkotlin.data.remote.dto.DataPostDto

class PostsRemoteImpl() : PostsRemote {

    override fun getPosts(): List<DataPostDto> {

        return mutableListOf(
            DataPostDto(
                id = 1,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 2,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 3,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 4,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 5,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 6,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 7,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 8,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 9,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 10,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 11,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 12,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 13,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 14,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 15,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 16,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 17,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 18,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 19,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 20,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 21,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 22,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 23,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 24,
                title = "EPL",
                description = "English Premier League"
            ),
            DataPostDto(
                id = 25,
                title = "EPL",
                description = "English Premier League"
            )
        )
    }

    override fun getPostInfo(): DataPostDto =
        DataPostDto(
            id = 1,
            title = "Manchester City",
            description = "Champion of the season 2021/2022 EPL"
        )
}