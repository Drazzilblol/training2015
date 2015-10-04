package javase01.t02;

/**
 * Created by Drazz on 04.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) * 2;
        }

        System.out.println("original array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print('\n');

        System.out.println("for");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + array[i - 1] + " ");
        }
        System.out.print('\n');

        System.out.println("while");
        int j = 1;
        while (j < array.length) {
            System.out.print(array[j] + array[j - 1] + " ");
            j += 2;
        }
        System.out.print('\n');

        System.out.println("do .... while");
        int k = 1;
        do {
            System.out.print(array[k] + array[k - 1] + " ");
            k += 2;
        } while (k < array.length);
        System.out.print('\n');
    }
}
