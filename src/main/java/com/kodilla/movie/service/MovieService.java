package com.kodilla.movie.service;

import com.kodilla.movie.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {


    public List<Movie> findAllMovies() {
        return new ArrayList<>(Arrays.asList
                (new Movie(1L),new Movie(2L),
                        new Movie(3L,"title","author")));
    }

    public Movie findMovieById(Long movieId) {
        return new Movie(4L);
    }

    public Movie createMovie(Movie movie) {
        return movie;
    }

    public void deleteMovie(Long movieId) {
        System.out.println("Watch out! I'm deleting!");
    }


    public Movie updateMovie(Movie movie, Movie movie1) {
        return movie1;
    }
}
