package javase02.t02.employe;

import javase02.t02.stationery.Stationery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Employe {
    private String name;
    private List<Stationery> stationeryList = new ArrayList<>();

    public Employe(String name) {
        this.name = name;
    }

    public void addStationeryToEmploye(Stationery stationery) {
        stationeryList.add(stationery);
    }

    @Override
    public String toString() {
        return name + " has a stationary, which cost " + calculateAllStationeryCost();
    }

    public int calculateAllStationeryCost() {
        int cost = 0;
        for (Stationery st : stationeryList) {
            cost += st.calculateTotalCost();
        }
        return cost;
    }

    public Stationery getStationeryFromList(int id) {
        return stationeryList.get(id);
    }

    public String getName() {

        return name;
    }

}
