package com.example.mybooksapplication.ui.onBoarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mybooksapplication.ui.onBoarding.listFragment.List1Fragment
import com.example.mybooksapplication.ui.onBoarding.listFragment.List2Fragment
import com.example.mybooksapplication.ui.onBoarding.listFragment.List3Fragment
import com.example.mybooksapplication.ui.onBoarding.listFragment.List4Fragment

class OnBoardingPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 4 // Количество ваших фрагментов
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
                    0 -> List1Fragment()
                    1 -> List2Fragment()
                    2 -> List3Fragment()
                    3 -> List4Fragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}