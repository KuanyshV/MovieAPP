package com.example.movieapp.request;

import com.example.movieapp.utils.Credantials;
import com.example.movieapp.utils.MovieApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Servicey {


    private static final Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
            .baseUrl(Credantials.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());


    private static final Retrofit retrofit = retrofitBuilder.build();
    private static final MovieApi movieApi = retrofit.create(MovieApi.class);

    public MovieApi getMovieApi(){
        return movieApi;
    }
}
