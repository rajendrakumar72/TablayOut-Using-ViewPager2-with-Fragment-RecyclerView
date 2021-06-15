package com.example.tablayoutusingkotlinwithrv.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayoutusingkotlinwithrv.R

class MovieAdapter (private var movieList:ArrayList<MovieModel>, private var context: Context):RecyclerView.Adapter<MovieAdapter.ViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
       val movieModel= movieList[position]
        holder.txtName.text = movieModel.movieName
        holder.imageId.setImageResource(movieModel.imageId)
    }

    override fun getItemCount(): Int {
       return movieList.size
    }

    class ViewHolder(itemView :View): RecyclerView.ViewHolder(itemView) {
        val txtName: TextView =itemView.findViewById(R.id.txtMovieName)
        val imageId: ImageView =itemView.findViewById(R.id.imageView)

    }

}