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

    private lateinit var binding1: FirstLayoutBinding

    private lateinit var binding2: SecondLayoutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding1 = FirstLayoutBinding.inflate(layoutInflater)
        binding.root.addView(binding1.root)

        binding2 = SecondLayoutBinding.inflate(layoutInflater)
        binding.root.addView(binding2.root)

      /*
        binding1.tvLayout1.text = "Hello from the first layout!"
        binding2.tvLayout2.text = "Hello from the second layout!"*/

        // Set the visibility of views in the main layout
        binding.mainFrameLayout.removeAllViews()
        binding.mainFrameLayout.addView(binding2.layoutMain2)

    }
}