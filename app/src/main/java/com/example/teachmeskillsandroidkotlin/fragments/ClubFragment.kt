package com.example.teachmeskillsandroidkotlin.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teachmeskillsandroidkotlin.R


class ClubFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val button = view.findViewById<Button>(R.id.button_recycler_back)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_ClubFragment_to_LeagueFragment)
        }
    }
}
















