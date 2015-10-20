package javase03.t01.main;

import javase03.to1.logger.CrazyLogger;

import java.util.Scanner;

/**
 * Created by Drazz on 20.10.2015.
 */
public class Main {
    public static void main(String... args) {
        CrazyLogger cl = new CrazyLogger();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            if (str.equals("")) break;
            if (str.contains("FINDTEXT")) {
                cl.findLogsByText(str.substring(str.indexOf("FINDTEXT") + 9));
            } else if (str.contains("FINDTIME")) {
                cl.findLogsByTime(str.substring(str.indexOf("FINDTIME") + 9));
            } else if (str.contains("FIND")) {
                cl.printFindedLogs(str.substring(str.indexOf("FIND") + 5));
            } else if (str.contains("PRINT")) {
                cl.printLog();
            } else {
                cl.log(str);
            }
        }
    }
}
