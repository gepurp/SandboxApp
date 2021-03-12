package com.octo.sandboxapp.menu

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.octo.sandboxapp.R

class MenuItemViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
    val testTextForList = itemView.findViewById(R.id.rv_holder_item) as TextView
}