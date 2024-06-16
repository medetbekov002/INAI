package com.example.mybooksapplication.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.mybooksapplication.databinding.ItemBooksBinding

class BooksAdapter(private var list: List<Int>) :
    RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        return BooksViewHolder(
            ItemBooksBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        val books: Int = list[position]
        holder.imageView.setImageResource(books)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class BooksViewHolder(binding: ItemBooksBinding) : RecyclerView.ViewHolder(binding.root) {
        val imageView: ImageView = binding.ivBooooks
    }
}