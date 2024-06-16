
package com.example.mybooksapplication.ui.contacts

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.SpannedString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mybooksapplication.R
import com.example.mybooksapplication.databinding.FragmentAboutAppBinding

class AboutAppFragment : Fragment() {

    private lateinit var binding: FragmentAboutAppBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAboutAppBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "Детское приложение проекта Arzamas.academy с лекциями, подкастами, сказками и колыбельными"
        val spannableString = SpannableString(text)
        val colorSpan = ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.fiol))
        spannableString.setSpan(colorSpan, 27, 43, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.texts.text = spannableString

        binding.ivFiol.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}