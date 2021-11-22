package com.codigo.uitest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.codigo.uitest.R
import com.codigo.uitest.databinding.FragmentDetailBinding
import com.codigo.uitest.viewpagers.CarImageAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import androidx.viewpager2.widget.ViewPager2


class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailBinding
    private val mAdapter : CarImageAdapter by lazy { CarImageAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
        setupListeners()
    }

    private fun setupListeners() {
        with(binding) {
            btnBack.setOnClickListener { findNavController().navigateUp() }
            vpCar.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                }

                override fun onPageSelected(position: Int) {
                    pageIndicator.selection = position
                }

                override fun onPageScrollStateChanged(state: Int) {
                }
            })
        }
    }

    private fun setupViewPager() {
        with(binding) {
            vpCar.adapter = mAdapter
        }
    }
}