package com.example.teachmeskillsandroidkotlin.fragments

import android.os.Bundle
//import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.teachmeskillsandroidkotlin.databinding.FragmentTestTwoBinding



class TestTwoFragment : Fragment() {

    private lateinit var binding: FragmentTestTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestTwoBinding.inflate(inflater, container, false)
//        val bundle = this.arguments
//        Log.d("TEST_ANDROID", "${bundle?.getInt("TestArg")}")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initButton()
    }

    private fun initButton() {
        binding.buttonTwoClick.setOnClickListener {
            Toast.makeText(context, "This is Test two fragment", Toast.LENGTH_SHORT).show()
        }
    }
}