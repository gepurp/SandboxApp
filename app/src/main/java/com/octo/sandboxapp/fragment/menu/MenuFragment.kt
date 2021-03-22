package com.octo.sandboxapp.fragment.menu

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
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

        // Creating an instance of RV Adapter class and setting it to RV
        val listOfItems = getListOfMenuItems()
        val adapterRV = MenuAdapterRV(listOfItems)
        menuFragmentBinding.rvMainMenu.adapter = adapterRV
        // Setting  RV's layout manager equal to LinearLayoutManager
        menuFragmentBinding.rvMainMenu.layoutManager = LinearLayoutManager(requireContext())

        Log.i("MenuFragment", "Called ViewModelProvider.get")
        menuViewModel = ViewModelProvider(this).get(MenuViewModel::class.java)

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

    // Creating the list for list of main menu items
    private fun getListOfMenuItems(): MutableList<String> {
        return mutableListOf(
            "Chords",
            "Intervals",
            "Circle of fifth",
            "Scales",
            "Progressions",
            "Chords",
            "Intervals",
            "Circle of fifth",
            "Scales",
            "Chords",
            "Intervals",
            "Circle of fifth",
            "Scales",
            "Chords",
            "Intervals",
            "Circle of fifth",
            "Scales",
            "Chords",
            "Intervals",
            "Circle of fifth",
            "Scales"
        )
    }

}