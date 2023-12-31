package com.example.loginandroid_29_09_2023.lst_movies_2.presenter;

import com.example.loginandroid_29_09_2023.beans.Pelicula;
import com.example.loginandroid_29_09_2023.lst_movies_2.ContractListMovies;
import com.example.loginandroid_29_09_2023.lst_movies_2.DataMovies;
import com.example.loginandroid_29_09_2023.lst_movies_2.model.LstMoviesModel;

import java.util.ArrayList;

public class LstMoviesPresenter implements ContractListMovies.Presenter,
                                        ContractListMovies.Model.OnLstMoviesListener{

    private ContractListMovies.View vista;
    private LstMoviesModel lstMoviesModel;
    public LstMoviesPresenter(ContractListMovies.View vista){
        this.vista = vista;
        lstMoviesModel = new LstMoviesModel(this);
    }
    @Override
    public void lstMovies(String filtro) {
        lstMoviesModel.moviesAPI("", this);
    }

    @Override
    public void onFinished(ArrayList<Pelicula> lstPelicula) {
        vista.successMovies(lstPelicula);
    }

    @Override
    public void onFailure(String err) {

    }
}
