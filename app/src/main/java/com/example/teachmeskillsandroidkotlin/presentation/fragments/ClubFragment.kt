package com.example.teachmeskillsandroidkotlin.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.teachmeskillsandroidkotlin.databinding.FragmentClubBinding
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost
import com.example.teachmeskillsandroidkotlin.presentation.view_models.ClubViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClubFragment : Fragment() {
    private lateinit var binding: FragmentClubBinding
    private val viewModel: ClubViewModel by viewModels()

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
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.postInfo.observe(viewLifecycleOwner) { postNewsInfo ->
            showInfoFragment(postNewsInfo)
        }
    }

    private fun showInfoFragment(postNewsInfo: DomainPost) {
        binding.postTitle.text = postNewsInfo.title
    }
}






