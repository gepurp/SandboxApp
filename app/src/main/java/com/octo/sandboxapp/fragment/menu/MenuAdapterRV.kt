package com.octo.sandboxapp.fragment.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.octo.sandboxapp.R

class MenuAdapterRV(
    private val customClickHandler: CustomClickHandler
) :
    RecyclerView.Adapter<MenuItemsViewHolder>() {

    private val listOfMenuItems: MutableList<MenuItemModel> = mutableListOf()

    fun setListOfMenuItems(list: MutableList<MenuItemModel>) {
        listOfMenuItems.clear()
        listOfMenuItems.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemsViewHolder {
        val view =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.main_menu_item, parent, false)
        return MenuItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemsViewHolder, position: Int) {
        val item = listOfMenuItems[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = listOfMenuItems.size

    override fun onViewAttachedToWindow(holder: MenuItemsViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.itemView.setOnClickListener {
            val position = holder.adapterPosition
            customClickHandler.elementWasClicked(listOfMenuItems[position].title)
        }
    }

    override fun onViewDetachedFromWindow(holder: MenuItemsViewHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.itemView.setOnClickListener(null)
    }
}

interface CustomClickHandler {
    fun elementWasClicked(value: String)
}