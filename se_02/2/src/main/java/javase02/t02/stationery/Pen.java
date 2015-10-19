package javase02.t02.stationery;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Pen extends Stationery {
    public Pen(int cost, int number) {
        super(cost, number);
    }

    @Override
    public String toString() {
        return getNumber() + " pens, each cost " + getCost();
    }
}
