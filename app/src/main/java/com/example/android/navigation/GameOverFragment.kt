package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    private var _binding: FragmentGameOverBinding? = null
    private val binding: FragmentGameOverBinding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGameOverBinding.inflate(
                inflater, container, false)
        // Add OnClick Handler for Try Again button
        binding.tryAgainButton.setOnClickListener{view: View->
            view.findNavController()
                .navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())}
        return binding.root
    }
}
