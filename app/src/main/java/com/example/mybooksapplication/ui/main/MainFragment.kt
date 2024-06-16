package com.example.mybooksapplication.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooksapplication.R
import com.example.mybooksapplication.databinding.FragmentMainBinding
import com.example.mybooksapplication.ui.main.BooksAdapter
import com.example.mybooksapplication.ui.main.BooksAdapter2


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: BooksAdapter
    private lateinit var adapter2: BooksAdapter2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivVanGogBook.setOnClickListener {
            findNavController().navigate(R.id.audioStarFragment)
        }

        binding.ivMenu.setOnClickListener {
            findNavController().navigate(R.id.menuFragment)
        }
        val list = arrayListOf<Int>()
        adapter = BooksAdapter(list)
        list.add(R.drawable.rectangle)
        list.add(R.drawable.book_q)
        list.add(R.drawable.book_w)
        list.add(R.drawable.book_e)
        list.add(R.drawable.image_book_van_gog)
        binding.recyclerBooks.adapter = adapter
        val list2 = arrayListOf<Int>()
        adapter2 = BooksAdapter2(list2)
        list2.add(R.drawable.image_book_van_gog)
        list2.add(R.drawable.book_w)
        list2.add(R.drawable.book_e)
        list2.add(R.drawable.rectangle)
        list2.add(R.drawable.book_q)
        binding.recyclerBooks2.adapter = adapter2
    }
}