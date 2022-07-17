package com.company.souravapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.company.souravapp.adapters.MainRecyclerAdapter
import com.company.souravapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private lateinit var recyclerList : RecyclerView

    var dataPlaces = listOf("https://www.sbs.ox.ac.uk/sites/default/files/London_0.jpg",
    "https://workpermit.com/sites/default/files/styles/large/public/22324191185_cf010e09e9_z.jpg");
    var dataName = listOf("London","Australia");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerList =  binding.recyclerList

        val adapterObj = MainRecyclerAdapter(this, dataPlaces, dataName)
        recyclerList.adapter = adapterObj

    }
}