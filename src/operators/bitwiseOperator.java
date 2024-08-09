package operators;
import java.util.Scanner;
public class bitwiseOperator {
    public void bitwiseOperatorUsage()
    {
        System.out.println("Enter two integers :");

        Scanner inp =new Scanner(System.in);
        int a,b;
        System.out.println("The first integer :");
        a= inp.nextInt();
        System.out.println("The second integer :");
        b= inp.nextInt();


        System.out.println("Bitwise or "+ a +"|"+ b +" the value is "+ (a|b));
        System.out.println("Bitwise AND "+ a +"&"+ b +" the value is "+ (a&b));
        System.out.println("Bitwise xor "+ a +"^"+ b +" the value is "+ (a^b));




    }

    public void bitshift()
    {
        System.out.println("Enter a integer: ");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println("Multiply the value using left shift is num<<1 which gives the value "+ (n<<1));
        System.out.println("divide the value by 2 using right shift is num<<1 which gives the value "+ (n>>1));

    }

    public void oddEven()
    {
        System.out.println("Enter the integer to check if it is even or odd" );
        Scanner inp= new Scanner(System.in);
        int n=inp.nextInt();
        n=n&1;
        if (n==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

    }



}
