package org.example.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieClientTest {
    MovieClient movieClient = new MovieClient();

    @Test
    void getMovieById() {
        var movie = movieClient.getMovieById();

        assertNotNull(movie);
        assertInstanceOf(Movie.class, movie);
        assertEquals("Batman Begins", movie.name());
    }

    @Test
    void getMovieByIdAsync() {
        var movie = movieClient.getMovieByIdAsync().join();

        assertNotNull(movie);
        assertInstanceOf(Movie.class, movie);
        assertEquals("Batman Begins", movie.name());
    }

    @Test
    void getAllMovies() {
        var movieList = movieClient.getAllMovies();

        assert movieList.size() == 10;
    }
}