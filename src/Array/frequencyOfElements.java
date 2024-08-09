package Array;


import java.util.Random;
import java.util.Arrays;

public class frequencyOfElements {
    public void findFrequencyOfElements()
    {
        Random rand =new Random();
        int arrSize= rand.nextInt(15);
        int[] arr =new int[arrSize];

        System.out.print("The generated array is ");

        for (int i=0;i<arr.length;i++)
        {
            arr[i]= rand.nextInt(5);
//
            System.out.print(arr[i]+", ");
        }
        Arrays.sort(arr);

        System.out.println();
        int count=0,prev=-1;
        for(int num:arr)
        {
//            System.out.println("Current :"+num);

            if (count==0)
            {
                prev=num;
                count+=1;

            } else if (count>=1 && prev==num) {
                count+=1;
            } else if (count>=1 && prev!=num) {
                System.out.println("The value "+prev+" has repeated for "+ count +" times.");
                count=1;
                prev=num;

            }

        }
        System.out.println("The value "+prev+" has repeated for "+ count +" times.");

    }
}
