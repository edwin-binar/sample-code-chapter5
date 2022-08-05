package com.example.samplechapter5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.samplechapter5.R
import com.example.samplechapter5.adapter.ViewPagerAdapter
import com.example.samplechapter5.databinding.ActivitySlidingBinding
import com.google.android.material.tabs.TabLayoutMediator

class SlidingActivity : AppCompatActivity() {

    var binding: ActivitySlidingBinding? = null

    val tabTitle = arrayOf("Sample 1","Sample 2")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlidingBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val viewPagerAdapter = ViewPagerAdapter(this)
        binding?.vpFragment?.adapter = viewPagerAdapter


        binding?.let {
            TabLayoutMediator(it.tlFragment,it.vpFragment){ tab, position->
                tab.text = tabTitle[position]
            }.attach()
        }

    }
}