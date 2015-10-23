package javase02.t03.sets;

import javase02.t03.stationery.Pen;
import javase02.t03.stationery.Stationery;

import java.util.List;

/**
 * Created by Drazz on 23.10.2015.
 */
public class BeginnerSet extends Set {
    public BeginnerSet(){
        List<Stationery> set = super.getSet();
        set.add(new Pen("Cheap pen", 1, 10));
        set.add(new Pen("Cheap pencil", 1, 5));
        set.add(new Pen("Cheap paper", 1, 50));
    }

}
