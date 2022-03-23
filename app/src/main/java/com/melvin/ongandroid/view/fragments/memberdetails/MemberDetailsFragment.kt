package com.melvin.ongandroid.view.fragments.memberdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.melvin.ongandroid.R
import com.melvin.ongandroid.databinding.FragmentMemberDetailsBinding


class MemberDetailsFragment : Fragment(R.layout.fragment_member_details) {

    private lateinit var binding: FragmentMemberDetailsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMemberDetailsBinding.bind(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.setTitle(R.string.string_title_member_detail_fragment)
    }


}