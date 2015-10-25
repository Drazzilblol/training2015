package javase02.t04.stationery;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Stationery {
    private String name;
    private int number;
    private int cost;

    public Stationery(String name, int cost, int number) {
        this.name = name;
        this.cost = cost;
        this.number = number;
    }

    public static void sortByCost(List<Stationery> stList) {
        Collections.sort(stList, new Comparator<Stationery>() {
            @Override
            public int compare(Stationery st1, Stationery st2) {

                int cost1 = st1.getCost();
                int cost2 = st2.getCost();
                if (cost1 > cost2) {
                    return 1;
                } else if (cost1 < cost2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public static void sortByName(List<Stationery> stList) {
        Collections.sort(stList, new Comparator<Stationery>() {
            @Override
            public int compare(Stationery st1, Stationery st2) {

                String name1 = st1.getName();
                String name2 = st2.getName();

                int x = String.CASE_INSENSITIVE_ORDER.compare(name1, name2);

                return x;

            }
        });
    }

    public static void sortByCostAndName(final List<Stationery> stList) {
        Collections.sort(stList, new Comparator<Stationery>() {
            @Override
            public int compare(Stationery st1, Stationery st2) {

                int cost1 = st1.getCost();
                int cost2 = st2.getCost();
                int x = cost1 - cost2;
                if (x == 0) {
                    String name1 = st1.getName();
                    String name2 = st2.getName();
                    x = String.CASE_INSENSITIVE_ORDER.compare(name1, name2);
                }
                return x;
            }
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calculateTotalCost() {
        return number * cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
