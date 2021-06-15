package com.example.tablayoutusingkotlinwithrv.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutusingkotlinwithrv.LocalFragment
import com.example.tablayoutusingkotlinwithrv.Sports
import com.example.tablayoutusingkotlinwithrv.WorldFragment

class ViewPageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 ->Sports()
            1 -> LocalFragment()
            2 -> WorldFragment()
        }
        return Sports()
    }
}