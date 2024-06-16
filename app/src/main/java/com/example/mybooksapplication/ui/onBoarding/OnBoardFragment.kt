package com.example.mybooksapplication.ui.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mybooksapplication.databinding.FragmentOnBoardBinding
import com.example.mybooksapplication.ui.onBoarding.OnBoardingPagerAdapter

class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter()

    }

    private fun adapter() {
        val viewPager = binding.viewPager
        val adapter = OnBoardingPagerAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter
    }
}