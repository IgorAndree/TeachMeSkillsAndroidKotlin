package com.example.teachmeskillsandroidkotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.data.models.LeagueAndClubModel

class LeagueAndClubRecyclerAdapter(
    private val items: List<LeagueAndClubModel>,
    private val listener: LeagueAndClubListener
) : RecyclerView.Adapter<LeagueAndClubRecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image)
        val titleTextView: TextView = itemView.findViewById(R.id.title)
        val descriptionTextView: TextView = itemView.findViewById(R.id.description)

        fun bind(itemView: View, listener: LeagueAndClubListener) {
            itemView.setOnClickListener {
                listener.onClick(itemView)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout, parent,
            false
        )


        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            imageView.setImageResource(items[position].image)
            titleTextView.text = items[position].title
            descriptionTextView.text = items[position].description

            holder.bind(imageView, listener)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    interface LeagueAndClubListener {
        fun onClick(itemView: View)
    }
}


