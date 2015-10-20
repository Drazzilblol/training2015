package javase03.to1.logger;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Drazz on 20.10.2015.
 */
public class CrazyLogger {
    private List<StringBuilder> sbList = new ArrayList<>();

    public void log(String str) {
        StringBuilder sb = new StringBuilder();
        String date = new SimpleDateFormat("dd-MM-YYYY : hh-mm-ss").format(new Date());
        sb.append(date + " - " + str + '\n');
        sbList.add(sb);
    }

    public void printLog() {
        for (StringBuilder sb : sbList) {
            System.out.print(sb.toString());
        }
    }

    public List<String> searchLogs(String str) {
        List<String> stringList = new ArrayList<>();
        for (StringBuilder sb : sbList) {
            if (sb.indexOf(str) != -1) {
                stringList.add(sb.toString());
            }
        }
        return stringList;
    }

    public void printFindedLogs(String str) {
        for (StringBuilder sb : sbList) {
            if (sb.indexOf(str) != -1) {
                System.out.print(sb.toString());
            }
        }
    }

    public void findLogsByText(String text) {
        for (StringBuilder sb : sbList) {
            if (sb.indexOf(text, 24) != -1) {
                System.out.print(sb.toString());
            }
        }
    }

    public void findLogsByTime(String time) {
        for (StringBuilder sb : sbList) {
            if (sb.substring(0, 22).indexOf(time) != -1) {
                System.out.print(sb.toString());
            }
        }
    }

}
