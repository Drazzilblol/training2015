package javase03.t02.questionnaire;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by Drazz on 26.10.2015.
 */
public class Questionnaire {
    Locale locale;
    ResourceBundle bundle;

    public void setLanguage() {
        System.out.println("Please choose your language:\n 1 - English\n 2 - Русский");
        Scanner in = new Scanner(System.in);
        String lan = in.nextLine();
        if (lan.equals("1")) {
            locale = new Locale("en", "US");
            bundle = ResourceBundle.getBundle("Language", locale);
        } else if (lan.equals("2")) {
            locale = new Locale("ru", "RU");
            bundle = ResourceBundle.getBundle("Language", locale);
        }
    }

    public void ask() {
        System.out.println(bundle.getString("my.ctq"));
        for (int i = 1; i <= Integer.parseInt(bundle.getString("my.quantity")); i++) {
            String s = bundle.getString("my." + i + "q");
            System.out.println(String.format("%s - %s", i, s));
        }
        System.out.println("0 - " + bundle.getString("my.exit"));
        Scanner in = new Scanner(System.in);
        String lan = in.nextLine();
        if (!lan.equals("0")){
            System.out.println(bundle.getString("my." + lan + "a"));
            ask();
        }else {
            return;
        }

    }


}
