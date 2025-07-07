package org.example.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MovieClient {
    private static final String ALL_MOVIES_URL = "http://127.0.0.1:8000/explore-latest-java-features/src/main/resources/movies.json";
    private static final String MOVIE_BY_ID_URL = "http://127.0.0.1:8000/explore-latest-java-features/src/main/resources/movie_by_id.json";

    private HttpClient httpClient;
    private ObjectMapper objectMapper;

    public MovieClient() {
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(2))
                .build();
        this.objectMapper = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    public Movie getMovieById() {
        HttpRequest request = requestBuilder(MOVIE_BY_ID_URL);

        try {
            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response status: " + response.statusCode());
            return objectMapper.readValue(response.body(), Movie.class);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<Movie> getMovieByIdAsync() {
        HttpRequest request = requestBuilder(MOVIE_BY_ID_URL);

        var response = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        return response.thenApply(httpResponse -> {
            System.out.println("Response status: " + httpResponse.statusCode());
            try {
                return objectMapper.readValue(httpResponse.body(), Movie.class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public List<Movie> getAllMovies() {
        HttpRequest request = requestBuilder(ALL_MOVIES_URL);

        try {
            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response status: " + response.statusCode());
            return objectMapper.readValue(response.body(), new TypeReference<List<Movie>>() { });
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private HttpRequest requestBuilder(String url) {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        return httpRequest;
    }
}
