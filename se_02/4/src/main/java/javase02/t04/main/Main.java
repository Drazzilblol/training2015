package javase02.t04.main;

import javase02.t04.employe.Employe;
import javase02.t04.sets.AdvancedSet;
import javase02.t04.sets.BeginnerSet;
import javase02.t04.stationery.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Main {
    public static void main(String... args) {
        Employe mark = new Employe("Mark");
        mark.addStationeryToEmploye(new Pencil("Viktor Gugo`s pencil1", 10000, 1));
        mark.addStationeryToEmploye(new Pencil("Viktor Gugo`s pencil2", 10000, 1));
        mark.addStationeryToEmploye(new Pencil("Viktor Gugo`s pencil", 10000, 1));

        mark.addSet(new BeginnerSet());
        Employe john = new Employe("John");
        john.addSet(new AdvancedSet());

        Stationery.sortByCostAndName(mark.getStationeryList());
        for (Stationery st : mark.getStationeryList()){
            System.out.println(st.getName());
        }




    }
}
