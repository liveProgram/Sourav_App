package com.company.souravapp.adapters

import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.company.souravapp.R
import com.company.souravapp.UserActivity
import com.company.souravapp.adapters.MainRecyclerAdapter.MyViewHolder
import com.company.souravapp.databinding.PlacesRecyclerUiBinding
import com.company.souravapp.model.Todos
import com.squareup.picasso.Picasso

class MainRecyclerAdapter(
    private val ctx: Context,
    private val dataPlaces: List<String>,
//    private val dataName: List<String>
    private val dataTodos: ArrayList<Todos>
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
        val todos : Todos = dataTodos[position]
        //holder.binding.namePlace.text = dataName[position]
        holder.binding.namePlace.text = todos.title
        Picasso.get()
            .load(dataPlaces[0])
            .into(holder.binding.imagePlace)

        // to apply clicking event in the recycler item
        holder.binding.root.setOnClickListener {
            val intent = Intent(ctx, UserActivity::class.java)
            intent.putExtra("todos",todos)
            ctx.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataTodos.size
    }

}
