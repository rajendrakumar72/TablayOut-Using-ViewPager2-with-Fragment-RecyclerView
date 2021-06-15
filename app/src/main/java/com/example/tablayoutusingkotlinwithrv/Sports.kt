package com.example.tablayoutusingkotlinwithrv

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayoutusingkotlinwithrv.adapter.MovieAdapter
import com.example.tablayoutusingkotlinwithrv.adapter.MovieModel


class Sports : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sports, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var  recyclerView: RecyclerView =view.findViewById(R.id.sportsRecyclerView)
        val context1: Context? =this.context
        val movieList=ArrayList<MovieModel>()
        movieList.add(MovieModel(R.drawable.lenovo_image, "Lenovo"))
        movieList.add(MovieModel(R.drawable.jumanji, "jumanji"))
        movieList.add(MovieModel(R.drawable.kotlinlogo, "Kotlin"))
        movieList.add(MovieModel(R.drawable.notimetodie, "No Time To Die"))
        movieList.add(MovieModel(R.drawable.old_gaurd, "Old Guard"))
        movieList.add(MovieModel(R.drawable.robin, "Robin"))
        movieList.add(MovieModel(R.drawable.sputnik, "Sputnik"))
        movieList.add(MovieModel(R.drawable.zack, "Zack Snyder Justice League"))

        recyclerView.layoutManager= LinearLayoutManager(context1)
        recyclerView.setHasFixedSize(true)
        //  val adapter= context1?.let { MovieAdapter(movieList, it) }
        val adapter= MovieAdapter(movieList,context1!!)
        recyclerView.adapter=adapter

    }


}