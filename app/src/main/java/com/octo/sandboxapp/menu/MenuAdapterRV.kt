package com.octo.sandboxapp.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.octo.sandboxapp.R

class MenuAdapterRV(private val menuItemsList: List<String>) :
    RecyclerView.Adapter<MenuItemViewHolder>() {

    override fun getItemCount(): Int {
        return menuItemsList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        val view =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.main_menu_item, parent, false)
        return MenuItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        // Getting element from names list at this position
        val item = menuItemsList[position]
        // Updating the text of the view in the list with this item
        holder.testTextForList.text = item
    }
}