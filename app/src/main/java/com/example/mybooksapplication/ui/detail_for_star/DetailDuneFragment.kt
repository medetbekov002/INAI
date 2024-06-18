package com.example.mybooksapplication.ui.detail_for_star

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooksapplication.R
import com.example.mybooksapplication.databinding.FragmentDetailDuneBinding

class DetailDuneFragment : Fragment() {

    private lateinit var binding: FragmentDetailDuneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailDuneBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivArr.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.btnNtxt.setOnClickListener {
            findNavController().navigate(R.id.testForDuneFragment)
        }
        binding.tvCon3.setOnClickListener {
            findNavController().navigate(R.id.audioDumeFragment)
        }

        binding.ivArr.setOnClickListener {
            findNavController().navigate(R.id.libFragment)
        }
    }
}