package javase02.t04.sets;

import javase02.t04.stationery.*;

import java.util.List;

/**
 * Created by Drazz on 23.10.2015.
 */
public class AdvancedSet extends Set {
    public AdvancedSet() {
        List<Stationery> set = super.getSet();
        set.add(new Pen("Expensive pen", 1, 50));
        set.add(new Pencil("Expensive pencil", 1, 55));
        set.add(new PackOfPaper("Expensive paper", 1, 200));
        set.add(new StationeryKnife("Stationery knife", 1, 250));
        set.add(new Yardstick("Yardstick", 1, 100));
    }
}
