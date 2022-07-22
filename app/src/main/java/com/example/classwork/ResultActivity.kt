package com.example.classwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classwork.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getStringExtra("key")
        binding.tvResult.text = result
    }
}