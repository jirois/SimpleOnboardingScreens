package com.nelsonomas.simpleonboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.nelsonomas.simpleonboarding.databinding.FragmentScreenOneBinding


class ScreenOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentScreenOneBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_screen_one, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.btnNext.setOnClickListener {
            viewPager?.currentItem = 1
        }
        binding.btnSkip.setOnClickListener {
            findNavController()
                .navigate(R.id.action_viewPager2_to_homeFragment)
        }

        return binding.root
    }

}