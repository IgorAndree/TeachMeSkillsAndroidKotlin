package com.example.teachmeskillsandroidkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.databinding.FragmentTestOneBinding

class TestOneFragment : Fragment() {

    private lateinit var binding: FragmentTestOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestOneBinding.inflate(inflater, container, false)
        binding.buttonOneClick.setOnClickListener {

        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        launchNextFragment()
    }

    private fun launchNextFragment() {
//        val bundle = Bundle()
//        bundle.putInt("TestArg", 1)
       val fragment = TestTwoFragment()
//       fragment.arguments = bundle
        parentFragmentManager
            .beginTransaction()
            .add(R.id.test_container, fragment)
            .commit()
    }
}
