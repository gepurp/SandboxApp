package com.octo.sandboxapp.fragment.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.octo.sandboxapp.R

class MenuAdapterRV(private val menuItemsList: List<String>) :
    RecyclerView.Adapter<MenuItemsViewHolder>() {

    override fun getItemCount(): Int {
        return menuItemsList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemsViewHolder {
        val view =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.main_menu_item, parent, false)
        return MenuItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemsViewHolder, position: Int) {
        // Getting element from names list at this position
        val item = menuItemsList[position]
        // Updating the text of the view in the list with this item
        holder.testTextForList.text = item
    }
}