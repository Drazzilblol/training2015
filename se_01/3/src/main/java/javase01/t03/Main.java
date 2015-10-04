package javase01.t03;

/**
 * Created by Drazz on 04.10.2015.
 */
public class Main {
    public static void main(String[] args)
    {
        if (Integer.parseInt(args[0])<Integer.parseInt(args[1])) {
            for (int i = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]); i += Integer.parseInt(args[2])) {
                System.out.print(i + " " + Math.tan((2 * i) - 3) + '\n');
            }
        }
        if (Integer.parseInt(args[0])>Integer.parseInt(args[1])) {
            for (int i = Integer.parseInt(args[0]); i >= Integer.parseInt(args[1]); i -= Integer.parseInt(args[2])) {
                System.out.print(i + " " + Math.tan((2 * i) - 3) + '\n');
            }
        }
    }
}
