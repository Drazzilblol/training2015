package javase02.t02.stationery;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Pencil extends Stationery {
    public Pencil(int cost, int number) {
        super(cost, number);
    }

    @Override
    public String toString() {
        return getNumber() + " pencils, each cost " + getCost();
    }
}
