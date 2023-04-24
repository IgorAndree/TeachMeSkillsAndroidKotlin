package com.example.teachmeskillsandroidkotlin.data

import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.data.models.LeagueModel

open class LeagueData {

    open fun elements(): List<LeagueModel> {

        return mutableListOf(
            LeagueModel(
                id = 1,
                image = R.drawable.epl_logo,
                title = "EPL",
                description = "English Premier League"
            ),
            LeagueModel(
                id = 2,
                image = R.drawable.laliga_santander_logo,
                title = "Liga BBVA",
                description = "Spanish LaLiga"
            ),
            LeagueModel(
                id = 3,
                image = R.drawable.bundesliga_logo,
                title = "Bundesliga",
                description = "German Bundesliga"
            ),
            LeagueModel(
                id = 4,
                image = R.drawable.serie_a_logo,
                title = "Serie-A",
                description = "Italian Serie A"
            ),
            LeagueModel(
                id = 5,
                image = R.drawable.ligue1_uber_eats_logo,
                title = "Ligue 1,Uber Eats",
                description = "French League 1"
            )
        )
    }
}

