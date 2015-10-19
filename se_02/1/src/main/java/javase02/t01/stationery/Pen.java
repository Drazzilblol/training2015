package javase02.t01.stationery;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Pen {
    private int number;
    private int cost;

    public Pen(int number, int cost)
    {
        this.number = number;
        this.cost = cost;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cost;
        result = prime * result + number;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pen other = (Pen) obj;
        if (cost != other.cost)
            return false;
        if (number != other.number)
            return false;
        return true;
    }

    @Override
    public String toString() {
        if (number > 1) {
            return number + " pens";
        }else
        {
            return "one pen";
        }

    }
}
