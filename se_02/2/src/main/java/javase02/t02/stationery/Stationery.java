package javase02.t02.stationery;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Stationery {
    private int number;
    private int cost;

    public Stationery(int cost, int number)
    {
        this.cost = cost;
        this.number = number;
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
