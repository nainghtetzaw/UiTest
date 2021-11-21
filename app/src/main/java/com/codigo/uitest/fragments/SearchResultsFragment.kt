package com.codigo.uitest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.codigo.uitest.R
import com.codigo.uitest.databinding.FragmentSearchResultsBinding
import com.codigo.uitest.recyclerviews.CarListDelegate
import com.codigo.uitest.recyclerviews.SearchResultCarAdapter

class SearchResultsFragment : Fragment(), CarListDelegate {

    private lateinit var binding : FragmentSearchResultsBinding
    private val mAdapter : SearchResultCarAdapter by lazy { SearchResultCarAdapter(this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchResultsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupListeners()
    }

    override fun onTapCar() {

    }

    private fun setupRecyclerView() {
        with(binding.layoutCarList) {
            rvCarList.adapter = mAdapter
            rvCarList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        }
    }

    private fun setupListeners() {
        with(binding) {
            btnBack.setOnClickListener { findNavController().navigateUp() }
        }
    }

}