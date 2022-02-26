package com.example.lab2.RecyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.NestedScrollingParent
import androidx.recyclerview.widget.RecyclerView

import com.example.lab2.databinding.ItemBinding

class ViewHolder private constructor(
    private val binding: ItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): ViewHolder {
            val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }
    }

    fun bind(music: Music) {
        binding.musicName.text = music.name
        binding.singerName.text = music.singer
    }
}


