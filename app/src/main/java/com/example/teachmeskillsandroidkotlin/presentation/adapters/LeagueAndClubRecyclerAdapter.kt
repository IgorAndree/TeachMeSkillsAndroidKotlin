package com.example.teachmeskillsandroidkotlin.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPostList

class LeagueAndClubRecyclerAdapter(
    private val items: DomainPostList,
    private val onItemClickEvent: (View) -> Unit
) : RecyclerView.Adapter<LeagueAndClubRecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.title)
        val descriptionTextView: TextView = itemView.findViewById(R.id.description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_layout, parent,
                false
            )

        view.setOnClickListener {
            onItemClickEvent(it)
        }

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            titleTextView.text = items.posts[position].title
            descriptionTextView.text = items.posts[position].description


        }
    }

    override fun getItemCount(): Int {
        return items.posts.size
    }
}



