package javase02.t02.stationery;

/**
 * Created by Drazz on 19.10.2015.
 */
public class PackOfPaper extends Stationery {
    public PackOfPaper(int cost, int number) {
        super(cost, number);
    }

    @Override
    public String toString() {
        return getNumber() + " packs of paper, each cost " + getCost();
    }
}
