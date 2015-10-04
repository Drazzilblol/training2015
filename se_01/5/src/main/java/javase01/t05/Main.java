package javase01.t05;

/**
 * Created by Drazz on 04.10.2015.
 */
public class Main {
    public static void main(String[] args)
    {
        int[][] arr = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(i == j || j == arr[i].length - i - 1)
                {
                    arr[i][j] = 1;
                }
                else
                {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
               System.out.print(arr[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}
