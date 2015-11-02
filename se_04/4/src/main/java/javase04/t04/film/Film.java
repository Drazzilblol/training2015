package javase04.t04.film;

import javase04.t04.artist.Artist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drazz on 02.11.2015.
 */
public class Film implements Serializable {
    private String name;
    private List<Artist> artists = new ArrayList<>();

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArtist(Artist artist) {
        artists.add(artist);
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
        artist.setFilm(this);
    }

    public void deleteArtist(String name) {
        for (Artist a : artists) {
            if (a.getName().toLowerCase().equals(name.toLowerCase())) {
                artists.remove(a);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "\n" + "------------------------------\n");
        for (Artist a : artists) {
            sb.append(a.getName() + "\n");
        }
        return sb.toString();
    }
}
