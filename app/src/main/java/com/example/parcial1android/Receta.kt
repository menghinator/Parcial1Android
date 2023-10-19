package com.example.parcial1android

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Receta (
    val id: Int,
    val nombre: String,
    val pais: Pais,
    val ingredientes: List<String>,
    val dificultad: Dificultad,
    val foto: String

): Parcelable