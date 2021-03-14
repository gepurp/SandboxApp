package com.octo.sandboxapp.fragment.menu

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.octo.sandboxapp.R

class MenuItemsViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
    val testTextForList = itemView.findViewById(R.id.rv_holder_item) as TextView
}