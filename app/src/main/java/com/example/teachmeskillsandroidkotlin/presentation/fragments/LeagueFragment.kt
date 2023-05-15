package com.example.teachmeskillsandroidkotlin.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.databinding.FragmentLeagueBinding
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPostList
import com.example.teachmeskillsandroidkotlin.presentation.adapters.LeagueAndClubRecyclerAdapter
import com.example.teachmeskillsandroidkotlin.presentation.view_models.LeagueViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LeagueFragment : Fragment() {
    private var _binding: FragmentLeagueBinding? = null
    private val binding get() = _binding!!
    private val viewModel: LeagueViewModel by viewModels()



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
        val posts = viewModel.postList.value ?: DomainPostList()

        binding.leagueRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = LeagueAndClubRecyclerAdapter(items = posts,
                onItemClickEvent = {
                    findNavController().navigate(R.id.action_LeagueFragment_to_ClubFragment)
                }
            )
        }
    }
}

