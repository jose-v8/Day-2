package Array;
import java.util.Random;

public class mazMin {

    static void find_max_min(int[] arr,int n)
    {
        int min=Integer.MAX_VALUE,max=Integer.MAX_VALUE;
        if ((arr[0]>=arr[1]) && (arr.length>1))
        {
            min=arr[1];max=arr[0];
        }
        else if ((arr[0]<arr[1]) && (arr.length>1))
        {
            min=arr[0];max=arr[1];
        }
        if (arr.length==1)
        {
            min=max=arr[0];
            return;
        }


        for (int i=2;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
            if (arr[i]>max)
            {
                max=arr[i];
            }

        }

        System.out.println("\nThe max value of the array is "+ max);
        System.out.println("The min value of the array is "+ min);

    }


    public void findMaxMin()
    {
        Random rand =new Random();
        int arrSize= rand.nextInt(15);
        int[] arr =new int[arrSize];

        System.out.print("The generated array is ");

        for (int i=0;i<arr.length;i++)
        {
            arr[i]= rand.nextInt(500);
            System.out.print(arr[i]+", ");
        }
        find_max_min(arr,arrSize);


//


    }
}
