package com.nelsonomas.simpleonboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nelsonomas.simpleonboarding.databinding.FragmentViewPagerBinding
import androidx.databinding.DataBindingUtil
import com.google.android.material.tabs.TabLayoutMediator

class ViewPager : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentViewPagerBinding= DataBindingUtil.inflate(inflater, R.layout.fragment_view_pager, container, false)

    val fragmentList = arrayListOf(
        ScreenOne(),
        ScreenTwo(),
        ScreenThree()
    )

      val adapter = ViewPagerAdapter(
          fragmentList,
          requireActivity().supportFragmentManager,
          lifecycle
      )
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, position ->

        }.attach()

        return binding.root
    }

}