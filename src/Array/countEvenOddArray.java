package Array;

import java.util.Random;

public class countEvenOddArray {
    public void countEvenOdd()
    {
        Random rand =new Random();
        int arrSize= rand.nextInt(15);
        int[] arr =new int[arrSize];
        int ec=0,oc=0;
        System.out.print("The generated array is ");

        for (int i=0;i<arr.length;i++)
        {
            arr[i]= rand.nextInt(500);
//            System.out.println("The created array is ");
            System.out.print(arr[i]+", ");
            if (arr[i]%2==1)
            {
                oc+=1;
            }
            else
            {
                ec+=1;
            }
        }
        System.out.println("\nThe number of even numbers in the array is "+ec);
        System.out.println("The number of odd numbers in the array is "+oc);


    }

}
