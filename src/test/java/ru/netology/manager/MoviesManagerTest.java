package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

public class MoviesManagerTest {

    private Movie movie1 = new Movie(1, "Бладшот", "боевик", false);
    private Movie movie2 = new Movie(2, "Вперёд", "мультфильм", false);
    private Movie movie3 = new Movie(3, "Отель Белград", "комедия", false);
    private Movie movie4 = new Movie(4, "Джентельмены", "боевик", false);
    private Movie movie5 = new Movie(5, "Человек-невидимка", "ужасы", false);
    private Movie movie6 = new Movie(6, "Тролли. Мировой тур", "мультфильм", true);
    private Movie movie7 = new Movie(7, "Номер один", "комедия", true);
    private Movie movie8 = new Movie(8, "Довод", "фантастика", false);
    private Movie movie9 = new Movie(9, "Ещё по одной", "драма", true);
    private Movie movie10 = new Movie(10, "Огонь", "драма", true);
    private Movie movie11 = new Movie(11, "Плохие парни навсегда", "боевик", false);
    private Movie movie12 = new Movie(12, "Душа", "мультфильм", false);


    @Test
    public void shouldAddMovie() {
        MoviesManager mov = new MoviesManager();
        mov.addMovie(movie1);

        Movie[] exp = {movie1};
        Movie[] act = mov.findAll();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldNotFindMovie() {
        MoviesManager mov = new MoviesManager();
        Movie[] exp = {};
        Movie[] act = mov.findAll();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldFindAllMovies() {
        MoviesManager mov = new MoviesManager();
        mov.addMovie(movie1);
        mov.addMovie(movie2);
        mov.addMovie(movie3);
        mov.addMovie(movie4);
        mov.addMovie(movie5);
        mov.addMovie(movie6);
        mov.addMovie(movie7);
        mov.addMovie(movie8);
        mov.addMovie(movie9);
        mov.addMovie(movie10);

        Movie[] exp = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Movie[] act = mov.findAll();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldFindAllMoviesOverLimit() {
        MoviesManager mov = new MoviesManager();
        mov.addMovie(movie1);
        mov.addMovie(movie2);
        mov.addMovie(movie3);
        mov.addMovie(movie4);
        mov.addMovie(movie5);
        mov.addMovie(movie6);
        mov.addMovie(movie7);
        mov.addMovie(movie8);
        mov.addMovie(movie9);
        mov.addMovie(movie10);
        mov.addMovie(movie11);
        mov.addMovie(movie12);

        Movie[] exp = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Movie[] act = mov.findAll();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldFindAllMoviesOverUserLimit() {
        MoviesManager mov = new MoviesManager(7);
        mov.addMovie(movie1);
        mov.addMovie(movie2);
        mov.addMovie(movie3);
        mov.addMovie(movie4);
        mov.addMovie(movie5);
        mov.addMovie(movie6);
        mov.addMovie(movie7);
        mov.addMovie(movie8);
        mov.addMovie(movie9);
        mov.addMovie(movie10);
        mov.addMovie(movie11);
        mov.addMovie(movie12);

        Movie[] exp = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movie[] act = mov.findAll();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldFindLastTenMovies() {
        MoviesManager mov = new MoviesManager();
        mov.addMovie(movie1);
        mov.addMovie(movie2);
        mov.addMovie(movie3);
        mov.addMovie(movie4);
        mov.addMovie(movie5);
        mov.addMovie(movie6);
        mov.addMovie(movie7);
        mov.addMovie(movie8);
        mov.addMovie(movie9);
        mov.addMovie(movie10);

        Movie[] exp = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movie[] act = mov.findLast();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldFindLastTenMoviesOverLimit() {
        MoviesManager mov = new MoviesManager();
        mov.addMovie(movie1);
        mov.addMovie(movie2);
        mov.addMovie(movie3);
        mov.addMovie(movie4);
        mov.addMovie(movie5);
        mov.addMovie(movie6);
        mov.addMovie(movie7);
        mov.addMovie(movie8);
        mov.addMovie(movie9);
        mov.addMovie(movie10);
        mov.addMovie(movie11);
        mov.addMovie(movie12);

        Movie[] exp = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        Movie[] act = mov.findLast();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldFindLastTenMoviesOverUserLimit() {
        MoviesManager mov = new MoviesManager(7);
        mov.addMovie(movie1);
        mov.addMovie(movie2);
        mov.addMovie(movie3);
        mov.addMovie(movie4);
        mov.addMovie(movie5);
        mov.addMovie(movie6);
        mov.addMovie(movie7);
        mov.addMovie(movie8);
        mov.addMovie(movie9);
        mov.addMovie(movie10);
        mov.addMovie(movie11);
        mov.addMovie(movie12);

        Movie[] exp = {movie12, movie11, movie10, movie9, movie8, movie7, movie6};
        Movie[] act = mov.findLast();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void shouldNotFindLastMovies() {
        MoviesManager mov = new MoviesManager();
        Movie[] exp = {};
        Movie[] act = mov.findLast();

        Assertions.assertArrayEquals(exp, act);
    }
}
