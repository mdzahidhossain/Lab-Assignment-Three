package BasicJava;

import java.util.Random;

public class QuestionNo3
{
    public static void main(String[] args)
    {
        Random g = new Random();

        int[] p = new int[10];
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int arrSize = array.length;

        for(int i = 0; i < p.length; i++)
        {

            int randPos = g.nextInt(arrSize);

            p[i] = array[randPos];

            for(int j = randPos + 1; j < arrSize; j++)
            {
                array[j - 1] = array[j];
            }
            arrSize--;
        }

        printArray(p);
    }

    public static void printArray(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            if (i > 0)
            {
                System.out.print(" ");
            }
            System.out.print(values[i]);
        }
        System.out.println();
    }
}
