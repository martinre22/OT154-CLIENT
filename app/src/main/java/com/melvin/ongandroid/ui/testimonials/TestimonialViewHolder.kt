package com.melvin.ongandroid.ui.testimonials

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.melvin.ongandroid.databinding.TestimonialItemBinding
import com.melvin.ongandroid.model.Testimonial

class TestimonialViewHolder(view: View): RecyclerView.ViewHolder(view){
    private val binding = TestimonialItemBinding.bind(view)

            fun bind(testimonial: Testimonial){
                binding.testimonialText.text = testimonial.message
                Picasso.get().load(testimonial.urlImage).into(binding.testimonialImage)
            }
}