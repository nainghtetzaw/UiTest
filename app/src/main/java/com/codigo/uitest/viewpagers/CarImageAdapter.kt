package com.codigo.uitest.viewpagers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codigo.uitest.databinding.ItemCarImageBinding

class CarImageAdapter : RecyclerView.Adapter<CarImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarImageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCarImageBinding.inflate(layoutInflater, parent, false)
        return CarImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarImageViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}