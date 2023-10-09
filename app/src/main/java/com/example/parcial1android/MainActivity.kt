package com.example.parcial1android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvReceta: RecyclerView
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvReceta = findViewById(R.id.rv_recetas)
        rvReceta.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(this)
        rvReceta.adapter = adapter
        adapter.submitList(getListadoRecetas())
    }

    private fun getListadoRecetas(): MutableList<Receta>{
    return mutableListOf(
        Receta(1,
            "Test",
            Pais.ARGENTINA,
            listOf("ingrediente1","ingrediente2"),
            Dificultad.PRINCIPIANTE,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7MCydoToJUHZmVoPRbZ2XfVH0dnqo9wqUfg&usqp=CAU")
    )
    }

}

