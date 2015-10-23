package javase02.t03.main;

import javase02.t03.employe.Employe;
import javase02.t03.sets.AdvancedSet;
import javase02.t03.sets.BeginnerSet;
import javase02.t03.stationery.*;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Main {
    public static void main(String... args) {
        Employe mark = new Employe("Mark");
        mark.addSet(new BeginnerSet());
        Employe john = new Employe("John");
        john.addSet(new AdvancedSet());
        System.out.println(mark.toString());
        System.out.println(john.toString());
        mark.addStationeryToEmploye(new Pencil("Viktors Gugo pencil", 10000, 1));
        System.out.println(mark.toString());
        for (Stationery st : mark.getStationeryList()){
            System.out.println(st.getName());
        }
    }
}
