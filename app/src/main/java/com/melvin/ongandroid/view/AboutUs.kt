package com.melvin.ongandroid.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.melvin.ongandroid.R
import com.melvin.ongandroid.databinding.FragmentAboutUsBinding

class AboutUs : Fragment(R.layout.fragment_about_us) {

    private lateinit var binding: FragmentAboutUsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAboutUsBinding.bind(view)
        binding.btnDetails.setOnClickListener {
            //Navigation.createNavigateOnClickListener(R.id.navFragmentDetailsMember, null)
            //Toast.makeText(context, "button", Toast.LENGTH_SHORT).show()
            val equip = Auto()
            val bundle = bundleOf("auto" to equip.marca)
            findNavController().navigate(R.id.action_navFragmentAboutUs_to_navFragmentDetailsMember, bundle)
        }
    }

    inner class Auto(val marca: String = "renault", val modelo: String = "megane 2")

}