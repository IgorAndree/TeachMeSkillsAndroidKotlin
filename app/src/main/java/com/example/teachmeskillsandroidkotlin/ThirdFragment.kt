package com.example.teachmeskillsandroidkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teachmeskillsandroidkotlin.adapters.RecyclerAdapter
import com.example.teachmeskillsandroidkotlin.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initMyFun()

        binding.buttonThird.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_SecondFragment)
        }
    }

    private fun initMyFun(){
        initRecycler()
    }

    private fun initRecycler() {
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = RecyclerAdapter(listOfElements())
        }
    }

    private fun listOfElements(): List<String> {
        val data = mutableListOf<String>()
        (0..20).forEach { i -> data.add("$i Файл") }
        return data
    }
}







