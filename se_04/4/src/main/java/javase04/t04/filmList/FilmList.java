package javase04.t04.filmList;

import javase04.t04.film.Film;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drazz on 02.11.2015.
 */
public class FilmList implements Serializable {

    private List<Film> films = new ArrayList<>();

    public void setFilm(Film film) {
        films.add(film);
    }

    public Film getFilm(int id) {
        return films.get(id);
    }

    public Film getFilmByName(String name) {
        for (Film f : films) {
            if (f.getName().toLowerCase().equals(name.toLowerCase())) {
                return f;
            }
        }
        return null;
    }

    public void deleteFilm(String name) {
        for (Film f : films) {
            if (f.getName().toLowerCase().equals(name.toLowerCase())) {
                films.remove(f);
            }
        }
    }

    public void printFilms() {
        for (Film f : films) {
            System.out.println(f.getName());
        }
    }
}
