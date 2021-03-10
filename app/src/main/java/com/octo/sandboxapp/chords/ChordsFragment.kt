package com.octo.sandboxapp.chords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.octo.sandboxapp.R
import com.octo.sandboxapp.databinding.FragmentChordsBinding

class ChordsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = DataBindingUtil.inflate<FragmentChordsBinding>(
            inflater,
            R.layout.fragment_chords,
            container,
            false
        )

        // Test fragment transition
        binding.tvTestChordsText.setOnClickListener {
            it.findNavController().navigate(R.id.action_chordsFragment_to_menuFragment)
        }

        return binding.root
    }
}