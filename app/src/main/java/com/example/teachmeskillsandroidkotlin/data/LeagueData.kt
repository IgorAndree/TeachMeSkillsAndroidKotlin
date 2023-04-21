package com.example.teachmeskillsandroidkotlin.data

import com.example.teachmeskillsandroidkotlin.data.models.LeagueModel

class LeagueData {

    open fun elements(LeagueModel: Any?): List<LeagueModel> {
        val league = mutableListOf(
            LeagueModel(
                id = 1,
                title = "Test Post Title",
                description = "Test Post Description"
            ),
            LeagueModel(
                id = 2,
                title = "Test Post Title",
                description = "Test Post Description"
            ),
            LeagueModel(
                id = 3,
                title = "Test Post Title",
                description = "Test Post Description"
            ),
            LeagueModel(
                id = 4,
                title = "Test Post Title",
                description = "Test Post Description"
            ),
            LeagueModel(
                id = 5,
                title = "Test Post Title",
                description = "Test Post Description"
            )
        )

