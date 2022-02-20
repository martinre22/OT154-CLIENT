package com.melvin.ongandroid.ui.testimonials

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.melvin.ongandroid.R
import com.melvin.ongandroid.databinding.FragmentTestimonialsBinding

class TestimonialsFragment : Fragment() {
    private lateinit var binding: FragmentTestimonialsBinding
    private lateinit var adapterTestimonials: TestimonialsAdapter
    private lateinit var viewModel: Te


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_testimonials, container, false)
    }

}