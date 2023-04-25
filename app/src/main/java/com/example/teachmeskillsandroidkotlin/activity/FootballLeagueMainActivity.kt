package com.example.teachmeskillsandroidkotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teachmeskillsandroidkotlin.databinding.ActivityMainFootballLeagueBinding

class FootballLeagueMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainFootballLeagueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainFootballLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}




