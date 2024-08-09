package operators;
import java.util.Scanner;
public class additionAndSubstraction {

    public void twoNumAddAndSub()
    {
        System.out.println(" ");
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1=inp.nextInt();

        System.out.print("Enter the second number: ");
        int n2=inp.nextInt();

        System.out.print("The sum is : "+(n1+n2)+"\n");
        System.out.print("The diff is: "+(n1-n2)+"\n");




    }
}
