package com.github.droibit.nav.animation.sample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_page.*

class Page3Fragment : Fragment(R.layout.fragment_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.setupWithNavController(findNavController())

        nextButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_page3Fragment_to_page4Fragment,
                null,
                NavOptions.Builder()
                    .setSlideAnimation()
                    .build()
            )
        }

        clearStackAndNextButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_page3Fragment_to_page4Fragment,
                null,
                NavOptions.Builder()
                    .setSlideAnimation()
                    .setPopUpTo(R.id.nav_graph, false)
                    .build()
            )
        }
    }
}