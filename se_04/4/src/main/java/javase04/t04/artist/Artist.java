package javase04.t04.artist;

import javase04.t04.film.Film;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drazz on 02.11.2015.
 */
public class Artist implements Serializable {
    private String name;
    private List<Film> films = new ArrayList<>();

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFilm(Film film) {
        films.add(film);
        film.setArtist(this);
    }

    public void setFilm(Film film){
        films.add(film);
    }

    public void deleteFilm(String name) {
        for (Film f : films) {
            if (f.getName().toLowerCase().equals(name.toLowerCase())) {
                films.remove(f);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "\n" + "------------------------------\n");
        for (Film f : films) {
            sb.append(f.getName() + "\n");
        }
        return sb.toString();
    }

}
