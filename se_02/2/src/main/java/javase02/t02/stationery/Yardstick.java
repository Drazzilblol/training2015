package javase02.t02.stationery;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Yardstick extends Stationery {
    public Yardstick(int cost, int number) {
        super(cost, number);
    }

    @Override
    public String toString() {
        return getNumber() + " yardsticks, each cost " + getCost();
    }
}
