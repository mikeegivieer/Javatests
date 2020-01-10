package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.Movie;
import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genere;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.*;

public class MovieServiceShould {

    @Test
    public void return_movies_by_genere() {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genere.ACTION),
                        new Movie(2, "Momento", 114, Genere.ACTION),
                        new Movie(3, "There's something about Mary", 100, Genere.HORROR),
                        new Movie(4, "Scream", 111, Genere.THRILLER),
                        new Movie(5, "Scream", 111, Genere.THRILLER),
                        new Movie(6, "Home alone", 111, Genere.COMEDY),
                        new Movie(7, "Matrix", 136, Genere.ACTION),
                        new Movie(8, "Comedy central", 136, Genere.COMEDY)
                )
        );
        MovieService movieService = new MovieService(movieRepository);
        Collection<Movie> movies = movieService.findMoviesByGenere(Genere.COMEDY);
        List<Integer> movieIds = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
        assertThat(movieIds, CoreMatchers.is(Arrays.asList(6, 8)));
    }
}