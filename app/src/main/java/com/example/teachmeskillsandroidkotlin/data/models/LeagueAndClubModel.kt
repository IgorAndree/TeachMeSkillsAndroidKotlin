package com.example.teachmeskillsandroidkotlin.data.models

import androidx.annotation.DrawableRes

data class LeagueAndClubModel(
    val id: Long,
    @DrawableRes val image: Int,
    val title: String,
    val description: String
)
