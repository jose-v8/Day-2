package logical;
import java.util.Scanner;

public class perfectnumber {
    public void checkPerfectNumber()
    {
        System.out.println("Enter the number to check if it is perfect number : ");
        Scanner inp= new Scanner(System.in);
        int n = inp.nextInt();
        int sum=0;

        for (int i=2;i<=n/2;i++)
        {
            if (n%i == 0)
            {
//                System.out.println("yes "+i);
                sum+=i;
            }
        }
        if ((sum+1)==n)
        {
            System.out.println("It is a perfect number");
        }
        else
            System.out.println("It is not a perfect number");


    }

}
