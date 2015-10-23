package javase02.t03.stationery;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Stationery {
    private String name;
    private int number;
    private int cost;

    public Stationery(String name, int cost, int number)
    {
        this.name = name;
        this.cost = cost;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calculateTotalCost()
    {
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
