package com.example.recycler_view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view.models.Anime

class MainActivity : AppCompatActivity() {
    private var data = mutableListOf<Anime>()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rec)

        data.add(Anime(image = R.raw.img, name = "Img 0", title = "Image"))
        data.add(Anime(image = R.raw.img_1, name = "Img 1", title = "Image"))
        data.add(Anime(image = R.raw.img_2, name = "Img 2", title = "Image"))
        data.add(Anime(image = R.raw.img_3, name = "Img 3", title = "Image"))
        data.add(Anime(image = R.raw.img_4, name = "Img 4", title = "Image"))
        data.add(Anime(image = R.raw.img_5, name = "Img 5", title = "Image"))
        data.add(Anime(image = R.raw.img_6, name = "Img 6", title = "Image"))
        data.add(Anime(image = R.raw.img_7, name = "Img 7", title = "Image"))
        data.add(Anime(image = R.raw.img_8, name = "Img 8", title = "Image"))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AnimeAdapter(data)
    }
}