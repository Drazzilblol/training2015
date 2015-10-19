package javase02.t01.main;

import javase02.t01.stationery.Pen;

/**
 * Created by Drazz on 19.10.2015.
 */
public class Main {

    public static void main(String ... args){
        Pen pen1 = new Pen(1, 10);
        Pen pen2 = new Pen(2, 5);
        Pen pen3 = new Pen(1, 10);

        System.out.println("overrided toString test");
        System.out.println(pen1.toString());
        System.out.println(pen2.toString());

        System.out.println("overrided hashCode test");
        System.out.println("1st pen hash = " + pen1.hashCode());
        System.out.println("2nd pen hash = " + pen2.hashCode());
        System.out.println("3rd pen hash = " + pen3.hashCode());

        System.out.println("overrided equals test");
        System.out.println("pen1.equals(pen2) = " + pen1.equals(pen2));
        System.out.println("pen1.equals(pen3) = " + pen1.equals(pen3));



    }
}
