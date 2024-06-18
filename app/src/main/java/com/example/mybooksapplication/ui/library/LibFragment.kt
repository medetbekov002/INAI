package com.example.mybooksapplication.ui.library

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooksapplication.R
import com.example.mybooksapplication.databinding.FragmentLibBinding


class LibFragment : Fragment() {

    private lateinit var binding: FragmentLibBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLibBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivArrowBack.setOnClickListener {
            findNavController().navigate(R.id.menuFragment)
        }
        binding.bk3.setOnClickListener {
            findNavController().navigate(R.id.detailsFragment)
        }
        binding.bk6.setOnClickListener {
            findNavController().navigate(R.id.detailForEdgeFragment)
        }
        binding.bk33.setOnClickListener {
            findNavController().navigate(R.id.detailDuneFragment)
        }
    }

}