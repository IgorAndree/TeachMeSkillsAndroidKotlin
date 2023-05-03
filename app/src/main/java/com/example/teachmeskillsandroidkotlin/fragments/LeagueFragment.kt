package com.example.teachmeskillsandroidkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.adapters.LeagueAndClubRecyclerAdapter
import com.example.teachmeskillsandroidkotlin.data.LeagueData
import com.example.teachmeskillsandroidkotlin.databinding.FragmentLeagueBinding

class LeagueFragment : Fragment(), LeagueAndClubRecyclerAdapter.LeagueAndClubListener {
    private var _binding: FragmentLeagueBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
        Bundle?
    ): View {

        _binding = FragmentLeagueBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initMyFun()

        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_LeagueFragment_to_ClubFragment)
        }

        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_LeagueFragment_to_LoginFragment)
        }
    }

    private fun initMyFun() {
        initRecycler()
    }

    private fun initRecycler() {
        binding.leagueRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = LeagueAndClubRecyclerAdapter(LeagueData().elements(), this@LeagueFragment)
        }
    }

    override fun onClick(itemView: View) {
        findNavController().navigate(R.id.action_LeagueFragment_to_ClubFragment)

    }
}
