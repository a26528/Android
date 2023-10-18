package com.example.loginandroid_29_09_2023.lst_films.model.entities;


import retrofit2.Call;
import retrofit2.http.GET;

public class MoviesAPI {

        @GET("movie/popular?api_key=TU_API_KEY")
        Call<MovieResponse> getPopularMovies() {


        }


}
