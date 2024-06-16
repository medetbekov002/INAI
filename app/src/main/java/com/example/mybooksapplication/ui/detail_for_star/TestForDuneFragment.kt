package com.example.mybooksapplication.ui.detail_for_star

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.mybooksapplication.R
import com.example.mybooksapplication.databinding.FragmentTestForDuneBinding

class TestForDuneFragment : Fragment() {

    private lateinit var binding: FragmentTestForDuneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTestForDuneBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivArr.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.btnEnd.setOnClickListener {
            findNavController().navigateUp()
            Toast.makeText(requireContext(), "У вас 6 правильных ответов", Toast.LENGTH_LONG).show();
        }
    }
}