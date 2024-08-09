package logical;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class couponNumber {
    public void displayDistinct()
    {
        System.out.println("Enter the number of coupons required ");
        Random rand=new Random();
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();

//        int ran=rand.nextInt(n*2);

        int[] arr=new int[n*2];
        Arrays.fill(arr,0);

        int check=0,count=0;

        while(check<n)
        {
            int x=rand.nextInt(n*2);
            if (arr[x]==0)
            {
                arr[x]=1;
                check+=1;
                count+=1;

            }
            else
                count+=1;
        }

        System.out.println("The total number of tries it took to create unique "+n+" coupons is "+count);



    }

}
