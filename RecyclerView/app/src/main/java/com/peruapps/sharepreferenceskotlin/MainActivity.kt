package com.peruapps.sharepreferenceskotlin

import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import android.support.v7.widget.RecyclerView
import android.widget.ListAdapter

class MainActivity : AppCompatActivity() {

    data class Movie(val title: String, val year: String, val description: String, val imagen:String )

    private val mNicolasCageMovies = listOf(
        Movie("Raising Arizona", "12343", "buena pelicula", "htttps://kdkdkdd.com"),
        Movie("Vampire's Kiss", "12343", "buena pelicula", "htttps://kdkdkdd.com"),
        Movie("Con Air", "12343", "buena pelicula", "htttps://kdkdkdd.com"),
        Movie("Gone in 60 Seconds", "12343", "buena pelicula", "htttps://kdkdkdd.com"),
        Movie("National Treasure", "12343", "buena pelicula", "htttps://kdkdkdd.com"),
        Movie("The Wicker Man", "12343", "buena pelicula", "htttps://kdkdkdd.com"),
        Movie("Ghost Rider", "12343", "buena pelicula", "htttps://kdkdkdd.com"),
        Movie("Knowing", "12343", "buena pelicula", "htttps://kdkdkdd.com")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recylerView:RecyclerView = findViewById(R.id.recyclerView)

        // RecyclerView node initialized here
        recylerView.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(context)
            // set the custom adapter to the RecyclerView
            adapter = AdapterKotlin(mNicolasCageMovies)
        }



    }
}
