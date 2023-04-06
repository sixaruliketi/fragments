package com.example.fragments.forViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragments.fragments.BlankFragment
import com.example.fragments.fragments.BlankFragment2

class ViewPagerAdapter(activity : FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> BlankFragment3()
            1 -> BlankFragment4()
            else -> BlankFragment3()
        }
    }
}