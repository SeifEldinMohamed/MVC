package com.seif.mvcproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seif.mvcproject.Pojo.MoviesModel
import com.seif.mvcproject.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val moviesList = ArrayList<MoviesModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        moviesList.add(MoviesModel("The Walking Dead","","",1))
        moviesList.add(MoviesModel("Cast Away","","",1))
        moviesList.add(MoviesModel("Avengers","","",1))
        moviesList.add(MoviesModel("Me before you","","",1))
        moviesList.add(MoviesModel("Justice","","",1))
        moviesList.add(MoviesModel("Ant Man","","",1))


        // val movie1 = MoviesNames("The Walking Dead", "2010","Zombie series",1)

        btn_movieName.setOnClickListener {
          txt_moviename.text =  getMovieName()
        }

    }
    // controller
     fun getMovieName():String{
       // return MoviesModel("The Walking Dead", "2010","Zombie series",1).name
         return  moviesList[Random.nextInt(0,6)].name

    }

}