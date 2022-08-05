package com.example.samplechapter5.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.samplechapter5.fragment.Sample2Fragment
import com.example.samplechapter5.fragment.SampleFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    val NUM_PAGES = 2

    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 ->{
                SampleFragment()
            }
            else->{
                Sample2Fragment()
            }
        }
    }
}