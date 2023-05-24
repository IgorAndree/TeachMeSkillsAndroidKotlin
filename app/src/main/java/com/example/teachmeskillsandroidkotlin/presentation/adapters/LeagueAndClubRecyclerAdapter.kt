package com.example.teachmeskillsandroidkotlin.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.teachmeskillsandroidkotlin.R
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost
import android.content.Context

class LeagueAndClubRecyclerAdapter(
    private var context: Context,
    private val items: List<DomainPost>,
    private val onItemClickEvent: (View) -> Unit
) : RecyclerView.Adapter<LeagueAndClubRecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageImageView: ImageView = itemView.findViewById(R.id.image)
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
            titleTextView.text = items[position].title
            descriptionTextView.text = items[position].description

            Glide
                .with(context)
                .load(items[position].urlToImage)
                .into(imageImageView)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}




