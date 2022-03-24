package com.melvin.ongandroid.view.fragments.memberdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.bumptech.glide.Glide
import com.melvin.ongandroid.R
import com.melvin.ongandroid.data.local.model.MembersModel
import com.melvin.ongandroid.databinding.FragmentMemberDetailsBinding


class MemberDetailsFragment : Fragment(R.layout.fragment_member_details) {

    private lateinit var binding: FragmentMemberDetailsBinding
    private lateinit var request: MembersModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMemberDetailsBinding.bind(view)
        request = arguments?.getParcelable<MembersModel>("detailsMember")!!
        setDetailsMember()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.setTitle(R.string.string_title_member_detail_fragment)
    }

    private fun setDetailsMember(){
        binding.textViewNameMemberFragmentMemberDetail.text = request.name
        binding.textViewDescriptionMemberFragmentMemberDetail.text = request.description
        binding.textViewLinkFacebookUrlFragmentMemberDetail.text = request.facebookUrl
        binding.textViewLinkLinkedinUrlFragmentMemberDetail.text = request.linkedinUrl
        setProfileImage()
    }

    private fun setProfileImage(){
        Glide.with(this)
            .load(request.image)
            .into(binding.imageMemberFragmentMemberDetail)
    }


}