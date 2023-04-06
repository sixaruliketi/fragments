package com.example.fragments.forViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.fragments.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity2 : AppCompatActivity() {

    private lateinit var myViewPager : ViewPager2
    private lateinit var tabBar : TabLayout
    private lateinit var fragmentStateAdapter: FragmentStateAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        myViewPager = findViewById(R.id.myViewPager)
        tabBar = findViewById(R.id.tabBar)
        fragmentStateAdapter = ViewPagerAdapter(this)

        myViewPager.adapter = fragmentStateAdapter
        TabLayoutMediator(tabBar,myViewPager){ tab, position ->
            tab.text = "${position + 1}"
        }.attach()

    }
}