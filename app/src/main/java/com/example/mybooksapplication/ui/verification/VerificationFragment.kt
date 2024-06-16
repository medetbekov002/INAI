package com.example.mybooksapplication.ui.verification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooksapplication.R
import com.example.mybooksapplication.databinding.FragmentVerificationBinding


class VerificationFragment : Fragment() {

    private lateinit var binding: FragmentVerificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVerificationBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cardGoogle.setOnClickListener {
            findNavController().navigate(R.id.chooseAccountFragment)
        }
        binding.cardVk.setOnClickListener {
            findNavController().navigate(R.id.chooseAccountFragment)
        }
        binding.cardApple.setOnClickListener {
            findNavController().navigate(R.id.chooseAccountFragment)
        }
    }
}