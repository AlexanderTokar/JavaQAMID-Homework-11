package ru.netology.manager;

import ru.netology.domain.Movie;

public class MoviesManager {
    private int quantityMovie = 10;
    private Movie[] movies = new Movie[0];

    public MoviesManager() {

    }

    public MoviesManager(int quantityMovie) {
        this.quantityMovie = quantityMovie;
    }

    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        int resultLength = movies.length;
        if (resultLength >= quantityMovie) {
            resultLength = quantityMovie;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[i];
        }
        return result;
    }

    public Movie[] findLast() {
        int resultLength = movies.length;
        if (resultLength >= quantityMovie) {
            resultLength = quantityMovie;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
