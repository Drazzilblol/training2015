package javase04.t04.main;

import javase04.t04.artist.Artist;
import javase04.t04.film.Film;
import javase04.t04.filmList.FilmList;

import java.io.*;

/**
 * Created by Drazz on 02.11.2015.
 */
public class Main {
    public static void main(String... args) {
        FilmList kp;
        File f = new File("kinopoisk.out");
        if (f.exists() && !f.isDirectory()) {
            kp = loadFromDisc();
        } else {
            kp = new FilmList();
        }
        Artist john = new Artist("John");
        Film rd = new Film("Red Dragon");
        Film rdtwo = new Film("Red Dragon 2: Revenge of Dragon");
        rd.addArtist(john);
        rdtwo.addArtist(john);
        kp.setFilm(rd);
        kp.setFilm(rdtwo);
        kp.printFilms();
        kp.deleteFilm("red dragon");
        kp.printFilms();
        saveToDisc(kp);

    }

    public static void saveToDisc(FilmList kp) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("kinopoisk.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(kp);
            //  oos.flush();
            //  oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }

    }

    public static FilmList loadFromDisc() {
        FileInputStream fis = null;
        FilmList kp = null;
        try {
            fis = new FileInputStream("kinopoisk.out");
            ObjectInputStream oin = new ObjectInputStream(fis);
            kp = (FilmList) oin.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }

        return kp;
    }
}
