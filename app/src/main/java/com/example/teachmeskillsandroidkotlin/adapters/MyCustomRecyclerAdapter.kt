package com.example.teachmeskillsandroidkotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.teachmeskillsandroidkotlin.R

class MyCustomRecyclerAdapter(
    private val images: Array<Int>, private val titles: Array<String>,
    private val descriptions: Array<String>
) :
    RecyclerView.Adapter<MyCustomRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val titleView: TextView = itemView.findViewById(R.id.titleView)
        val descriptionView: TextView = itemView.findViewById(R.id.descriptionView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout, parent,
            false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])
        holder.titleView.text = titles[position]
        holder.descriptionView.text = descriptions[position]
    }

    override fun getItemCount(): Int {
        return images.size
    }
}