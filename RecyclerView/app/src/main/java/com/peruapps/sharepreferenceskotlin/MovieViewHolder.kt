package com.peruapps.sharepreferenceskotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Jorge Ventura on 12/08/2019.
 * jventuraperuapps@gmail.com
 *
 * Peru Apps
 * Trujillo, Peru.
 **/

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_recycler, parent, false)) {
    private var textName: TextView? = null
    private var texDescription: TextView? = null
    private var textDescriptionTwo: TextView? = null


    init {
        textName = itemView.findViewById(R.id.textName)
        texDescription = itemView.findViewById(R.id.texDescription)
        textDescriptionTwo = itemView.findViewById(R.id.textDescriptionTwo)
    }

    fun bind(movie: MainActivity.Movie) {
        textName?.text = movie.title
        texDescription?.text = movie.year
        textDescriptionTwo?.text = movie.description
    }

}