package javase02.t04.employe;

import javase02.t04.sets.Set;
import javase02.t04.stationery.Stationery;

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

    public void addSet(Set set) {
        stationeryList.addAll(set.getSet());
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

    public List<Stationery> getStationeryList() {
        return stationeryList;
    }

    public String getName() {

        return name;
    }

}
