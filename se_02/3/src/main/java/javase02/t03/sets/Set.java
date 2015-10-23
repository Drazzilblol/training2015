package javase02.t03.sets;

import javase02.t03.stationery.Stationery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drazz on 23.10.2015.
 */
public class Set {
    private String name;

    private List<Stationery> stSet = new ArrayList<>();

    public List<Stationery> getSet() {
        return stSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
