package com.example.parcial1android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var rvReceta: RecyclerView
private lateinit var adapter: Adapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvReceta = findViewById(R.id.rv_recetas)
        rvReceta.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(this)
        rvReceta.adapter = adapter
    }
}

