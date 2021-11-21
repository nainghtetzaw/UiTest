package com.codigo.uitest.recyclerviews

import androidx.recyclerview.widget.RecyclerView
import com.codigo.uitest.databinding.ItemSearchResultCarBinding

class SearchResultCarViewHolder(val binding : ItemSearchResultCarBinding, mDelegate : CarListDelegate)
    : RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener { mDelegate.onTapCar() }
        }
}