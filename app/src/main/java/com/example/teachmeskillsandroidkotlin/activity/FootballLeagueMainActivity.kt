package com.example.teachmeskillsandroidkotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.teachmeskillsandroidkotlin.R
//import com.example.teachmeskillsandroidkotlin.databinding.ActivityMainFootballLeagueBinding
import com.example.teachmeskillsandroidkotlin.databinding.ActivityTestBinding
import com.example.teachmeskillsandroidkotlin.fragments.TestOneFragment
import com.example.teachmeskillsandroidkotlin.fragments.TestTwoFragment

class FootballLeagueMainActivity : AppCompatActivity() {
    //    private lateinit var binding: ActivityMainFootballLeagueBinding
    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding = ActivityMainFootballLeagueBinding.inflate(layoutInflater)
//        setContentView(binding.root)


        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigateToOne.setOnClickListener {
            goFragment(fragment = TestOneFragment())
        }

        binding.navigateToTwo.setOnClickListener {
            goFragment(fragment = TestTwoFragment())
        }
    }

    private fun goFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.test_container, fragment)
            .commit()
    }
}




