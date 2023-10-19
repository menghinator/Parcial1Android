package com.example.parcial1android

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class RecipeActivity : AppCompatActivity() {
    private lateinit var ivImagenPlato: ImageView
    private lateinit var tvNombreReceta: TextView
    private lateinit var tvPaisOrigen: TextView
    private lateinit var tvDificultadReceta: TextView
    private lateinit var tvIngredientes: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        val receta = intent.getParcelableExtra<Receta>("receta")

        ivImagenPlato = findViewById(R.id.iv_imagen_plato)
        tvNombreReceta = findViewById(R.id.tv_nombre_receta)
        tvPaisOrigen = findViewById(R.id.tv_pais_origen)
        tvDificultadReceta = findViewById(R.id.tv_dificultad_receta)
        tvIngredientes = findViewById(R.id.tv_ingredientes)

        tvNombreReceta.text = receta?.nombre
        tvPaisOrigen.text = receta?.pais.toString()
        tvDificultadReceta.text = receta?.dificultad.toString()

        var ingredientes: List<String>? = receta?.ingredientes
        val builder = StringBuilder()
        ingredientes?.forEach {
            builder.appendln(it)
        }
        tvIngredientes.text = builder.toString()


        Glide.with(this).load(receta?.foto).into(ivImagenPlato)

    }
}