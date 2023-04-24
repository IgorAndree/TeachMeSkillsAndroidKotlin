package com.example.teachmeskillsandroidkotlin.data.models

import androidx.annotation.DrawableRes

data class LeagueModel(
    val id: Long,
    @DrawableRes val image: Int,
    val title: String,
    val description: String
)
