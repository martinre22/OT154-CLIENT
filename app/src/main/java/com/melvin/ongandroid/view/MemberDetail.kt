package com.melvin.ongandroid.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.melvin.ongandroid.R
import com.melvin.ongandroid.databinding.FragmentMemberDetailBinding

class MemberDetail : Fragment(R.layout.fragment_member_detail) {

    private lateinit var binding: FragmentMemberDetailBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMemberDetailBinding.bind(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val request = arguments?.getString("auto")
        Toast.makeText(context, request.toString(), Toast.LENGTH_SHORT).show()
    }


}

