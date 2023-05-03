package com.example.teachmeskillsandroidkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teachmeskillsandroidkotlin.adapters.LeagueAndClubRecyclerAdapter
import com.example.teachmeskillsandroidkotlin.data.ClubData
import com.example.teachmeskillsandroidkotlin.databinding.FragmentClubBinding

class ClubFragment : Fragment(), LeagueAndClubRecyclerAdapter.LeagueAndClubListener {
    private lateinit var binding: FragmentClubBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentClubBinding.inflate(inflater, container, false)
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbarClub)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarClub.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        initMyFun()

        return binding.root
    }

    private fun initMyFun() {
        initRecycler()
    }

    private fun initRecycler() {
        binding.clubRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = LeagueAndClubRecyclerAdapter(ClubData().elements(), this@ClubFragment)
        }
    }

    override fun onClick(itemView: View) {
        Toast.makeText(context, "Top arrow back to leagues!!!", Toast.LENGTH_SHORT).show()
    }
}


















