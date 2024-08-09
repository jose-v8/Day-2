package Array;

import java.awt.*;
import java.util.Random;

public class arrayReversal {
    public void printReverseArray()
    {
        Random rand =new Random();
        int arrSize= rand.nextInt(15);
        int[] arr =new int[arrSize];

        System.out.print("The generated array is ");

        for (int i=0;i<arr.length;i++)
        {
            arr[i]= rand.nextInt(500);
//            System.out.println("The created array is ");
            System.out.print(arr[i]+", ");
        }

        System.out.println("\nThe reversed array");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+", ");

        }



    }

}
