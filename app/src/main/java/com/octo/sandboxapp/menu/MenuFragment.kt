package com.octo.sandboxapp.menu

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.transition.TransitionInflater
import com.octo.sandboxapp.R
import com.octo.sandboxapp.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var menuFragmentBinding: FragmentMenuBinding

    private lateinit var menuViewModel: MenuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val menuFragmentBinding = DataBindingUtil.inflate<FragmentMenuBinding>(
            inflater,
            R.layout.fragment_menu,
            container,
            false
        )

        // Test fragment transition
        menuFragmentBinding.tvTestMenuText.setOnClickListener {
            it.findNavController().navigate(R.id.action_menuFragment_to_chordsFragment)
        }

        Log.i("MenuFragment", "Called ViewModelProvider.get")
        menuViewModel = ViewModelProvider(this).get(MenuViewModel::class.java)

        // Test observer
        menuViewModel.testClickCount.observe(viewLifecycleOwner, Observer { clickCount ->
            if (clickCount % 10 == 0) {
                showToastMessage("You clicked the item ten times")
            }
        })

        return menuFragmentBinding.root
    }

    private fun showToastMessage(message: String) {
        Toast.makeText(
            context,
            message,
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = TransitionInflater.from(requireContext())
        exitTransition = inflater.inflateTransition(R.transition.fade)
    }
}