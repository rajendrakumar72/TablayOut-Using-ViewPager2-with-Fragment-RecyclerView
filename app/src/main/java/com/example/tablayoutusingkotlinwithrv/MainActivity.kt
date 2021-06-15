package com.example.tablayoutusingkotlinwithrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tablayoutusingkotlinwithrv.adapter.ViewPageAdapter
import com.example.tablayoutusingkotlinwithrv.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    var title= arrayOf("Sports", "Local", "World")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
       init()
    }

    private fun init(){
        supportActionBar!!.elevation = 0f

        binding!!.viewPager2.adapter=(ViewPageAdapter(this))
        TabLayoutMediator(binding!!.tabLayoutContainer, binding!!.viewPager2){tab:TabLayout.Tab,position:Int-> tab.text = title[position]}.attach()

       // TabLayoutMediator(binding!!.tabLayoutContainer, binding!!.viewPager2) { tab: TabLayout.Tab, position: Int -> tab.text = title[position] }.attach()
    }
}

