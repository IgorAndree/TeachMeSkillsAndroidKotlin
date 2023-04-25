package com.example.teachmeskillsandroidkotlin.fragments

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teachmeskillsandroidkotlin.adapters.MyCustomRecyclerAdapter
import com.example.teachmeskillsandroidkotlin.data.ClubData
import com.example.teachmeskillsandroidkotlin.databinding.FragmentClubBinding

class ClubFragment : Fragment() {
    private lateinit var binding: FragmentClubBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentClubBinding.inflate(inflater, container, false)
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbarClub)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarClub.setNavigationOnClickListener { requireActivity().onBackPressed() }

        initMyFun()

        return binding.root
    }

    private fun initMyFun() {
        initRecycler()
    }

    private fun initRecycler() {
        binding.clubRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MyCustomRecyclerAdapter(ClubData().elements())
        }
    }
}


















