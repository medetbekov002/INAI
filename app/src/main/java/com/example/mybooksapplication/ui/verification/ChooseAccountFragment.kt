package com.example.mybooksapplication.ui.verification

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooksapplication.R
import com.example.mybooksapplication.databinding.FragmentChooseAccountBinding

class ChooseAccountFragment : Fragment() {

    private lateinit var binding: FragmentChooseAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChooseAccountBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.constraintAvatar.setOnClickListener {
            val prefs = requireActivity().getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putBoolean("isAuthenticated", true)
            editor.apply()
            findNavController().navigate(R.id.welcomeFragment)
        }
    }
}