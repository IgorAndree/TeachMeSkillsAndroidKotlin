package com.example.teachmeskillsandroidkotlin.data

import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.data.models.LeagueAndClubModel

open class ClubData {

    open fun elements(): List<LeagueAndClubModel> {
        return mutableListOf(

            LeagueAndClubModel(
                id = 1,
                image = R.drawable.manchester_city_logos,
                title = "Manchester City",
                description = "Champion of the season"
            ),

            LeagueAndClubModel(
                id = 2,
                image = R.drawable.real_madrid_logos,
                title = "Real Madrid",
                description = "Champion of the season"
            ),

            LeagueAndClubModel(
                id = 3,
                image = R.drawable.bayern_munchen_logos,
                title = "Bayern Munich",
                description = "Champion of the season"
            ),

            LeagueAndClubModel(
                id = 4,
                image = R.drawable.milan_logos,
                title = "Milan",
                description = "Champion of the season"
            ),

            LeagueAndClubModel(
                id = 5,
                image = R.drawable.paris_saint_germain_logos,
                title = "Paris Saint-Germain",
                description = "Champion of the season"
            )
        )
    }
}