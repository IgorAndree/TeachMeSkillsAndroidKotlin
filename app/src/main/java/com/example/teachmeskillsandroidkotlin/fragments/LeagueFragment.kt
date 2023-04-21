package com.example.teachmeskillsandroidkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.adapters.MyCustomRecyclerAdapter
import com.example.teachmeskillsandroidkotlin.data.LeagueData
import com.example.teachmeskillsandroidkotlin.data.models.LeagueModel
import com.example.teachmeskillsandroidkotlin.databinding.FragmentLeagueBinding

class LeagueFragment : Fragment() {
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

        binding.buttonFeedNext.setOnClickListener {
            findNavController().navigate(R.id.action_LeagueFragment_to_RecyclerFragment)
        }

        binding.buttonFeedBack.setOnClickListener {
            findNavController().navigate(R.id.action_LeagueFragment_to_LoginFragment)

        }
    }
    private fun initMyFun(){

        initRecycler()
    }
    private fun initRecycler() {
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = MyCustomRecyclerAdapter(LeagueData().elements(LeagueModel))
        }
    }
}
