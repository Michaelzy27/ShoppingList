package com.michael.shoppinglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class recyclerViewAdapter(val userList: ArrayList<recyclerData>) :
    RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var user:recyclerData = userList[position]
        holder.title.text = user.title
    }


    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        var title:TextView = item.findViewById(R.id.list_id)


    }

}