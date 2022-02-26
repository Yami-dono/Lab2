package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab2.RecyclerView.Music
import com.example.lab2.databinding.ActivityAddItemBinding

class AddItem : AppCompatActivity() {
    private lateinit var binding: ActivityAddItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding= ActivityAddItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.save.setOnClickListener {
            val name = binding.edtName.text.toString()
            val singer = binding.edtSinger.text.toString()

            val music = Music(name, singer)

            MainActivity.Music.add(music)


            finish()
        }
    }
}