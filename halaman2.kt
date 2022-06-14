package com.example.projectakhirsemesterdanangokta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class halaman2 : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<TokohAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)

        //setting layout menjadi lenear layout
        layoutManager = LinearLayoutManager(this)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        //set layout untuk recyclerview
        recyclerView.layoutManager = layoutManager


        //call class adapter dan set recyclerview sesuai dengan adapter yang telah kita dibuat sebelumnya
        adapter = TokohAdapter()
        recyclerView.adapter = adapter

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@halaman2)
            setHasFixedSize(true)
            adapter = TokohAdapter ()
        }
    }

}

