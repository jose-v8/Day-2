package Array;

import java.util.Arrays;
import java.util.Random;

public class duplicateElements {
    public void duplicateElements()
    {
        Random rand =new Random();
        int arrSize= rand.nextInt(15);
        int[] arr =new int[arrSize];

        System.out.print("The generated array is ");

        for (int i=0;i<arr.length;i++)
        {
            arr[i]= rand.nextInt(5);
//            System.out.println("The created array is ");
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int flag=0;
//        5 1 2 3 3 3 6
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]==arr[i-1] && flag==0)
            {
                flag=1;
                System.out.println("Duplicate was found for the element "+arr[i-1]);
            } else if (arr[i]!=arr[i-1] && flag==1) {
                flag=0;


            }
        }


    }

}
