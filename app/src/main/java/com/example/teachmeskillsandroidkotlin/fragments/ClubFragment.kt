package com.example.teachmeskillsandroidkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.adapters.MyCustomRecyclerAdapter

class ClubFragment : Fragment() {

    private lateinit var customAdapter: MyCustomRecyclerAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_club, container, false)
        val images = arrayOf(R.id.imageView)
        val titles = arrayOf("Кот", "Рыба", "Змея")
        val descriptions = arrayOf("Мультяшный котик", "Мультяшная рыбка", "Мультяшная змейка")

        customAdapter = MyCustomRecyclerAdapter(images, titles, descriptions)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = customAdapter

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val button = view.findViewById<Button>(R.id.button_recycler_back)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_RecyclerFragment_to_LeagueFragment)
        }
    }
}

















