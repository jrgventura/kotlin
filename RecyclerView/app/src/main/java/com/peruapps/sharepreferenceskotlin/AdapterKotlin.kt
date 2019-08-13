package com.peruapps.sharepreferenceskotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Jorge Ventura on 12/08/2019.
 * jventuraperuapps@gmail.com
 *
 * Peru Apps
 * Trujillo, Peru.
 **/

class AdapterKotlin (private val list: List<MainActivity.Movie>)
    : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: MainActivity.Movie = list[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = list.size

}
