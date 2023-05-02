package com.example.myapplication.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.screen.ProductFragmentItem

class ProductPageAdapter(fragment: Fragment, var list: MutableList<String>) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
       return ProductFragmentItem()
    }
}