package com.example.teachmeskillsandroidkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teachmeskillsandroidkotlin.databinding.FragmentFeedBinding

class FeedFragment : Fragment() {
    private var _binding: FragmentFeedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
        Bundle?
    ): View {

        _binding = FragmentFeedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initMyFun()

        binding.buttonFeedNext.setOnClickListener {
            findNavController().navigate(R.id.action_FeedFragment_to_RecyclerFragment)
        }

        binding.buttonFeedBack.setOnClickListener {
            findNavController().navigate(R.id.action_FeedFragment_to_LoginFragment)

        }
    }
    private fun initMyFun(){
        spinner()
        initListView()
    }

    private fun spinner() {
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                itemSelected: View, selectedItemPosition: Int, selectedId: Long
            ) {
                val choose = resources.getStringArray(R.array.for_spinner)
                val toast = Toast.makeText(
                    requireContext(),
                    choose[selectedItemPosition],
                    Toast.LENGTH_SHORT
                )
                toast.show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

    private fun initListView() {
        val adapter = ArrayAdapter.createFromResource(
            requireContext(), R.array.for_list,
            android.R.layout.simple_list_item_1
        )

        binding.list.adapter = adapter

    }
}
