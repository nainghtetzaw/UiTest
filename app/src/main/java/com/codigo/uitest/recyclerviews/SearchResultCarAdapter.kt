package com.codigo.uitest.recyclerviews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codigo.uitest.databinding.ItemSearchResultCarBinding

class SearchResultCarAdapter(delegate : CarListDelegate) : RecyclerView.Adapter<SearchResultCarViewHolder>() {

    private val mDelegate : CarListDelegate = delegate

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultCarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemSearchResultCarBinding.inflate(layoutInflater, parent, false)
        return SearchResultCarViewHolder(binding, mDelegate)
    }

    override fun onBindViewHolder(holder: SearchResultCarViewHolder, position: Int) {
        if (position == 0) {
            holder.binding.hideSeparator = true
        }
    }

    override fun getItemCount(): Int {
        return 10
    }
}