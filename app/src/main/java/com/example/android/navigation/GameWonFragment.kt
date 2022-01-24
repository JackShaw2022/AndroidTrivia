package com.example.android.navigation

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {
    private var _binding: FragmentGameWonBinding? = null
    private val binding: FragmentGameWonBinding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGameWonBinding.inflate(
                inflater, container, false)
        // Add OnClick Handler for Next Match button
        binding.nextMatchButton.setOnClickListener{view: View->
            view.findNavController()
                .navigate(GameWonFragmentDirections.actionGameWonFragmentToGameFragment())}
        Toast.makeText(context, "NumCorrect: 4, NumQuestions: 4", Toast.LENGTH_LONG).show()
        setHasOptionsMenu(true)
        return binding.root
    }

    private fun getShareIntent() : Intent {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain")
            .putExtra(Intent.EXTRA_TEXT, getString(R.string.share_success_text))
        return shareIntent
    }

    private fun shareSuccess() {
        startActivity(getShareIntent())
    }
}
