package com.company.souravapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.company.souravapp.R
import com.company.souravapp.adapters.MainRecyclerAdapter.MyViewHolder
import com.company.souravapp.databinding.PlacesRecyclerUiBinding
import com.squareup.picasso.Picasso

class MainRecyclerAdapter(
    private val ctx: Context,
    private val dataPlaces: List<String>,
    private val dataName: List<String>
) :
    RecyclerView.Adapter<MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding: PlacesRecyclerUiBinding = PlacesRecyclerUiBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.places_recycler_ui, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.namePlace.text = dataName[position]
        Picasso.get()
            .load(dataPlaces[position])
            .into(holder.binding.imagePlace)

    }

    override fun getItemCount(): Int {
        return dataName.size
    }
}