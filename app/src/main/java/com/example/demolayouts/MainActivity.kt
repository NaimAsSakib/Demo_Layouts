package com.example.demolayouts

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demolayouts.databinding.ActivityMainBinding
import com.example.demolayouts.databinding.FirstLayoutBinding
import com.example.demolayouts.databinding.SecondLayoutBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.layout1InInclude.root.visibility=View.VISIBLE
        binding.layout2InInclude.root.visibility=View.GONE
    }
}