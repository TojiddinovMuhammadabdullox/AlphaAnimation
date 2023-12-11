package com.example.mdan10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.mdan10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alphabtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.alfa_anim)
            binding.imageView.startAnimation(animation)
        }

    }
}