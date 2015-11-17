package com.example.Anwar_ASI.popularmoviesasi;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface GetMovieApi {

    @GET("/3/discover/movie")
    Movie getMovies(
            @Query("sort_by") String sortOrder,
            @Query("api_key") String apiKey
    );

    @GET("/3/movie/{movieId}")
    VideoReview getVideoReviews(
            @Path("movieId") String movieId,
            @Query("api_key") String apiKey,
            @Query("append_to_response") String append
    );

}
