package com.octo.sandboxapp.fragment.menu

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.octo.sandboxapp.R

class MenuItemsViewHolder(
    private val menuItemView: View
) : RecyclerView.ViewHolder(menuItemView) {

    fun bind(menuItemModel: MenuItemModel) {
        val menuItemTitle = menuItemView.findViewById(R.id.rv_holder_item) as TextView
        menuItemTitle.text = menuItemModel.title
    }
}