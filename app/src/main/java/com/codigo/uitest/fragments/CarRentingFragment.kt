package com.codigo.uitest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.codigo.uitest.R
import com.codigo.uitest.databinding.FragmentCarRentingBinding

class CarRentingFragment : Fragment() {

    private lateinit var binding : FragmentCarRentingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarRentingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.layoutSearch.btnGo.setOnClickListener { findNavController().navigate(R.id.action_carRentingFragment_to_searchResultsFragment) }
    }
}