package com.example.teachmeskillsandroidkotlin.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toastPassword = Toast.makeText(
            context,
            "The password must contain at least 8 characters!!!",
            Toast.LENGTH_SHORT
        )
        binding.buttonLoginNext.setOnClickListener {
            if (binding.editTextPassword.length() >= 8) {
                findNavController().navigate(R.id.action_LoginFragment_to_LeagueFragment)
            } else {
                toastPassword.show()
            }
        }
    }
}






