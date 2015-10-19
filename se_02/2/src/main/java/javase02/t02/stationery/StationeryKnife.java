package javase02.t02.stationery;

/**
 * Created by Drazz on 19.10.2015.
 */
public class StationeryKnife extends Stationery {
    public StationeryKnife(int cost, int number) {
        super(cost, number);
    }

    @Override
    public String toString() {
        return getNumber() + " stationery knifes, each cost " + getCost();
    }
}
