package logical;
import java.util.Scanner;
public class primenumber {

    public void checkPrime()
    {
        System.out.println("Enter the number to check if it is prime or not");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int flag=0;

        for (int i=2;i<=n/2;i++)
        {
            if (n%i==0)
            {
                System.out.println("The number "+n+" is not prime number ");
                flag=1;
                break;

            }
        }

        if (flag==0)
        {
            System.out.println("The number "+n+" is  prime number ");
        }

    }
}
