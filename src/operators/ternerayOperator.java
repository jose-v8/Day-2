package operators;
import java.util.Scanner;


public class ternerayOperator {
    public void minOfTwoNumberTernery()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter two numbers to find the min among them ");
        System.out.print("Enter the first value : ");
        int n1=inp.nextInt();
        System.out.print("Enter the second value: ");
        int n2=inp.nextInt();

        n1=n1>n2?n2:n1;
        System.out.println("The minimum of the two integers is "+ n1);



    }

}
