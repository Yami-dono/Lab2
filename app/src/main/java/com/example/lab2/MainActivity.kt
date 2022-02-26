package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.RecyclerView.Adapter
import com.example.lab2.RecyclerView.Music
import com.example.lab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    binding.listMusics.run{
        layoutManager=LinearLayoutManager(this@MainActivity)
        setHasFixedSize(true)
        adapter=Adapter(Music)
    }
    binding.addButton.setOnClickListener{
        val intent=Intent(this@MainActivity,AddItem::class.java)
        startActivity(intent)
    }
    }

    override fun onResume() {
        super.onResume()
        binding.listMusics.adapter= Adapter(Music)
    }
    companion object{
        val Music= mutableListOf<Music>()
    }
}