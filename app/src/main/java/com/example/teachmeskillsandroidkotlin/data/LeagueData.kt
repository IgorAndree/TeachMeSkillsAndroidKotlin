package com.example.teachmeskillsandroidkotlin.data

import com.example.teachmeskillsandroidkotlin.data.models.LeagueModel

open class LeagueData {

    open fun elements(): List<LeagueModel> {

        val leagues = mutableListOf(
            LeagueModel(
                id = 1,
                imageId = 1,
                title = "Test Post Title",
                description = "Test Post Description"
            ),
            LeagueModel(
                id = 2,
                imageId = 2,
                title = "Test Post Title",
                description = "Test Post Description"
            ),
            LeagueModel(
                id = 3,
                imageId = 3,
                title = "Test Post Title",
                description = "Test Post Description"
            ),
            LeagueModel(
                id = 4,
                imageId = 4,
                title = "Test Post Title",
                description = "Test Post Description"
            ),
            LeagueModel(
                id = 5,
                imageId = 5,
                title = "Test Post Title",
                description = "Test Post Description"
            )
        )
        return leagues
    }
}

