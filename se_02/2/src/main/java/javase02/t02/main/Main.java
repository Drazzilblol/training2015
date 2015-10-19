package javase02.t02.main;

import javase02.t02.employe.Employe;
import javase02.t02.stationery.*;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Main {
    public static void main(String... args) {
        Employe mark = new Employe("Mark");
        Employe john = new Employe("John");
        mark.addStationeryToEmploye(new Pen(50, 2));
        mark.addStationeryToEmploye(new Pencil(20, 3));
        mark.addStationeryToEmploye(new PackOfPaper(150, 2));
        mark.addStationeryToEmploye(new Yardstick(25, 1));
        mark.addStationeryToEmploye(new StationeryKnife(190, 1));
        john.addStationeryToEmploye(new Pencil(30, 1));
        john.addStationeryToEmploye(new PackOfPaper(150, 1));
        john.addStationeryToEmploye(new StationeryKnife(200, 1));
        System.out.println(mark.toString());
        System.out.println(mark.getStationeryFromList(2).toString());
        System.out.println(john.toString());
    }
}
