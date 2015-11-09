package se05.t01.fileExplorer;

import java.util.Scanner;

/**
 * Created by Drazz on 09.11.2015.
 */
public class ConsoleExplorer {

    public void run() {
        Scanner in = new Scanner(System.in);
        FileExplorer fe = new FileExplorer("C:/");
        while (in.hasNextLine()) {
            String str = in.nextLine();
            if (str.equals("")) {
                break;
            }
            if (str.contains("BACK")) {
                fe.back();
            } else if (str.contains("DELETE")) {
                fe.deleteFile(str.substring(str.indexOf("DELETE") + 7));
            } else if (str.contains("LIST")) {
                fe.printFilesList();
            } else if (str.contains("MKDIR")) {
                fe.newDir(str.substring(str.indexOf("MKDIR") + 6));
            } else if (str.contains("READ")) {
                fe.readFile(str.substring(str.indexOf("READ") + 5));
            } else if (str.contains("WRITE")) {
                System.out.println("Please write text");
                Scanner scanner = new Scanner(System.in);
                StringBuilder sb = new StringBuilder();
                while (scanner.hasNextLine()) {
                    String st = scanner.nextLine();
                    sb.append(st + "\n");
                    if (st.equals("")) {
                        break;
                    }
                }
                fe.writeFile(str.substring(str.indexOf("WRITE") + 6), sb.toString());
            } else {
                fe.goTo(str);
            }
        }
    }

}
