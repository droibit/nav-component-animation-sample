package com.github.droibit.nav.animation.sample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_page.*

class Page4Fragment : Fragment(R.layout.fragment_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.setupWithNavController(findNavController())

        nextButton.setOnClickListener {
            Toast.makeText(requireContext(), "Dead end.", Toast.LENGTH_SHORT).show()
        }
    }
}