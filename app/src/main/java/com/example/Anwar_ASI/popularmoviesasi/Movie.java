package com.example.Anwar_ASI.popularmoviesasi;

import java.util.List;


public class Movie {

    public List<Results> results;

    public class Results {
        String id;
        String backdrop_path;
        String original_title;
        String overview;
        String release_date;
        String poster_path;
        String popularity;
        String vote_average;
    }

}
