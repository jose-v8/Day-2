package logical;
import java.util.Scanner;

public class numberReverse {
    public void printReverseNumber()
    {
        System.out.println("Enter a number to display its reverse :");
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        int rev=0;

        while(n>0)
        {
            rev+=n%10;
            n=n/10;
            rev*=10;
        }
        System.out.println("The reversed number is "+rev/10);
    }

}
