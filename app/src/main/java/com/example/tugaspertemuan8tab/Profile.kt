package com.example.tugaspertemuan8tab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugaspertemuan8tab.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("name")
        val nim = intent.getStringExtra("nim")


        binding.nameTextView.text = "Name: $name"
        binding.nimTextView.text = "NIM: $nim"
    }
}
