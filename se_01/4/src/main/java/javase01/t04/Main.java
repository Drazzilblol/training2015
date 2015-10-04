package javase01.t04;

/**
 * Created by Drazz on 04.10.2015.
 */
public class Main {
    public static void main(String[] args)
    {
        float[] array = new float[Integer.parseInt(args[0]) * 2];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (float) (Math.random() * 200) - 100;
            System.out.print(array[i] + " ");
        }
        System.out.print('\n');

        float max = 0;
        for (int i = 0; i < array.length / 2; i++)
        {
            if (array[i] + array[array.length - i - 1] > max)
            {
                max = array[i] + array[array.length - i - 1];
            }
        }
        System.out.println(max);
    }
}
