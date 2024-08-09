package Array;

import java.util.Scanner;

public class sumAvgArray {
    public void findSumAvg()
    {
        System.out.println("Enter the number of elements");
        Scanner inp= new Scanner(System.in);
        int n= inp.nextInt();
        int[] arr = new int[n];
        int sum=0;


        System.out.println("Enter the elements of the array ");
        for (int i=1;i<=n;i++) {
            System.out.print("Element "+i+" : " );
            int a;
            a=inp.nextInt();
            sum+=a;
            System.out.println();
        }
        System.out.println("The sum of the array is "+ sum);
        System.out.println("The avg of the array sum is "+ sum/n);
    }

}
