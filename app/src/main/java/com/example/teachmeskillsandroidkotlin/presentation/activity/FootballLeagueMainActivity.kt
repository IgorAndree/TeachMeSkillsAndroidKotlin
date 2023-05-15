package com.example.teachmeskillsandroidkotlin.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teachmeskillsandroidkotlin.databinding.ActivityMainFootballLeagueBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FootballLeagueMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainFootballLeagueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainFootballLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}




