package com.example.teachmeskillsandroidkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.teachmeskillsandroidkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toast = Toast.makeText(
            context,
            "Пароль должен содержать минимум 8 символов!!!",
            Toast.LENGTH_SHORT
        )

        binding.buttonFirst.setOnClickListener {

            if (binding.editTextPassword.length() >= 8) {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

            } else {
                toast.show()
            }
        }
    }
}