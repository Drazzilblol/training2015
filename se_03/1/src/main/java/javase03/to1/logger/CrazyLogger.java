package javase03.to1.logger;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Drazz on 20.10.2015.
 */
public class CrazyLogger {
    //  private List<StringBuilder> sbList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public void run(){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            if (str.equals("")) break;
            if (str.contains("FINDTEXT")) {
                findLogsByText(str.substring(str.indexOf("FINDTEXT") + 9));
            } else if (str.contains("FINDTIME")) {
                findLogsByTime(str.substring(str.indexOf("FINDTIME") + 9));
            } else if (str.contains("FIND")) {
                printFindedLogs(str.substring(str.indexOf("FIND") + 5));
            } else if (str.contains("PRINT")) {
                printLog();
            } else {
                log(str);
            }
        }
    }

    public void log(String str) {
        String date = new SimpleDateFormat("dd-MM-YYYY : hh-mm-ss").format(new Date());
        sb.append(date + " - " + str + ";\n");
    }

    public void printLog() {
        System.out.println(sb.toString());
    }

    public void printFindedLogs(String str) {
        for (String s : sb.toString().split("\n")) {
            if (s.indexOf(str) != -1) {
                System.out.println(s);
            }
        }
    }

    public void findLogsByText(String text) {
        for (String s : sb.toString().split("\n")) {
            if (s.indexOf(text, 24) != -1) {
                System.out.println(s);
            }
        }
    }

    public void findLogsByTime(String time) {
        for (String s : sb.toString().split("\n")) {
            if (s.substring(0, 22).indexOf(time) != -1) {
                System.out.println(s);
            }
        }
    }

}
