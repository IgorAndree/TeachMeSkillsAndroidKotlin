package com.example.teachmeskillsandroidkotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.teachmeskillsandroidkotlin.R

class RecyclerAdapter(private val items: List<String>) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val largeTextView: TextView = itemView.findViewById(R.id.text_item_1)
        val smallTextView: TextView = itemView.findViewById(R.id.text_item_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_items, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            largeTextView.text = items[position]
            smallTextView.text = "Показать"
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}