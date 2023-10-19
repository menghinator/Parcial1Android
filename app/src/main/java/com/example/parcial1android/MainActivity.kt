package com.example.parcial1android

import android.content.Intent
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

        adapter.onItemClickListener = {
            navigateReceta(it)
        }
    }

    private fun navigateReceta(receta: Receta){
        val intent = Intent(this,RecipeActivity::class.java)
        intent.putExtra("receta",receta)
        startActivity(intent)
    }

    private fun getListadoRecetas(): MutableList<Receta>{
    return mutableListOf(
        Receta(1,
            "Panna cotta",
            Pais.ITALIA,
            listOf("Azucar","Crema","Gelatina"),
            Dificultad.FACIL,
            "https://static01.nyt.com/images/2023/08/10/multimedia/LH-Panna-Cotta-wczm/LH-Panna-Cotta-wczm-superJumbo.jpg"),
        Receta(2,
            "Jiaozi",
            Pais.CHINA,
            listOf("Harina","Carne Picada","Hongos","Cebolla de verdeo","Salsa de soja"),
            Dificultad.INTERMEDIO,
            "https://kirbiecravings.com/wp-content/uploads/2020/01/jiaozi-dumplings-12.jpg"),
        Receta(3,
            "Creme Brulee",
            Pais.FRANCIA,
            listOf("Clara","Yema","Crema","Azucar","Vainilla"),
            Dificultad.AVANZADO,
            "https://assets.afcdn.com/recipe/20161201/4190_w1024h1024c1cx2705cy1803.webp"),
        Receta(4,
            "Miso Ramen",
            Pais.JAPON,
            listOf("Miso","Caldo de Cerdo","Fideos","Salsa de Soja","Dashi"),
            Dificultad.FACIL,
            "https://dishingouthealth.com/wp-content/uploads/2022/01/SpicyMisoRamen_Square.jpg"),
        Receta(5,
            "Florentinos",
            Pais.ITALIA,
            listOf("Azucar","Miel","Crema","Almendras","Chocolate"),
            Dificultad.INTERMEDIO,
            "https://www.latercera.com/resizer/sEGl4-u3wMo7kQ8KbLDBZ9Y9McU=/900x600/smart/cloudfront-us-east-1.images.arcpublishing.com/copesa/6DKDUWYZXVFQLMFEMJ4SNHCZ54.JPG"),
        Receta(6,
            "Carrot Cake",
            Pais.INGLATERRA,
            listOf("Huevos","Azucar","Zanahoria","Harina","Canela","Jengibre","Nuez Moscada","Sal"),
            Dificultad.INTERMEDIO,
            "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2007/2/16/0/ry0401_carrotcake.jpg.rend.hgtvcom.1280.1280.suffix/1552488933139.jpeg"),
        Receta(7,
            "Locro",
            Pais.ARGENTINA,
            listOf("Maiz","Porotos","Panceta","Chorizo Criollo","Chorizo Colorado","Pechito de Cerdo","Falda","Cebolla","Calabaza"),
            Dificultad.INTERMEDIO,
            "https://www.clarin.com/img/2022/04/29/hIhovn6Ct_720x0__1.jpg"),
        Receta(8,
            "Buffalo Wings",
            Pais.EEUU,
            listOf("Alitas de Pollo","Aceite","Polvo de Ajo","Sal","Salsa Picante","Miel","Manteca"),
            Dificultad.FACIL,
            "https://hips.hearstapps.com/hmg-prod/images/classic-buffalo-wings-horizontal-279-1547506155.jpg"),
        Receta(9,
            "Picanha",
            Pais.BRASIL,
            listOf("Picanha","Aceite","Cerveza","Sal","Pimienta"),
            Dificultad.FACIL,
            "https://www.cocina-brasilena.com/base/stock/Recipe/36-image/36-image_web.jpg.webp"),
        Receta(10,
            "Ceviche",
            Pais.PERU,
            listOf("Pimienta","Pescado a eleccion","Cebolla","Aji","Cilantro","Limon","Sal","Caldo de Pescado","Lechuga","Batata","Maiz"),
            Dificultad.FACIL,
            "https://cdn0.recetasgratis.net/es/posts/7/4/1/ceviche_peruano_18147_600.webp"),
    )
    }

}

