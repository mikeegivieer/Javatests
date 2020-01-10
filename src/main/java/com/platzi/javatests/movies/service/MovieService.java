package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.Movie;
import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genere;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenere(Genere genere) {

        Collection<Movie> allMovies = movieRepository.findAll().stream()
                .filter(movie -> movie.getGenere()==genere).collect(Collectors.toList());

        return allMovies;
    }
}
