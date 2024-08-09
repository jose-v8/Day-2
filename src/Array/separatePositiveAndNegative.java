package Array;

import java.util.Arrays;
import java.util.Random;

public class separatePositiveAndNegative {
    public void separatePositiveNegative()
    {
        Random rand =new Random();
        int arrSize= rand.nextInt(15);
        int[] arr =new int[arrSize];
        int ngv=0,pos=0;

        System.out.print("The generated array is ");

        for (int i=0;i<arr.length;i++)
        {
            arr[i]= rand.nextInt(-500,500);
//
            System.out.print(arr[i]+", ");
            if(arr[i]>=0)
            {
                pos+=1;
            }
            else {
                ngv+=1;
            }


        }

        int[] parr =new int[pos];
        int[] narr= new int[ngv];
        int i=0,j=0;
        for (int num:arr)
        {
            if (num<0)
            {
                narr[i]=num;
                i+=1;

            }
            else
            {
                parr[j]=num;
                j+=1;
            }


        }
        System.out.println("\nThe positive integer array is "+ Arrays.toString(parr));
        System.out.println("The negative integer array is "+Arrays.toString(narr));


    }

}
