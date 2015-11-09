package se05.t02.main;

import se05.t02.propertiesReader.PropertiesReader;

/**
 * Created by Drazz on 09.11.2015.
 */
public class Main {
    public static void main(String... args) {
        PropertiesReader pr = new PropertiesReader("C:\\Users\\Drazz\\training\\se_05\\2\\src\\main\\resources\\1.properties");
        System.out.print(pr.getValue("my.quantity"));
    }
}
