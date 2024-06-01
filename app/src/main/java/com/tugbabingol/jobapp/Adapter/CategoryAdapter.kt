package com.tugbabingol.jobapp.Adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import java.util.Locale.Category

class CategoryAdapter(private val items:List<String>,val clickListener:ClickListener): RecyclerView.Adapter<CategoryAdapter.Viewholder>() {
    inner class Viewholder(val binding:Viewholder):RecyclerView.ViewHolder()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.Viewholder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CategoryAdapter.Viewholder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    interface ClickListener {
        fun onClick(category: String)
    }
}