package operators;
import java.util.Scanner;
public class postAndPreIncrement {
    public void postIncrementAndPreIncrement()
    {

        System.out.println("Enter a number to show the difference between the post and pre increment ");
        Scanner inp= new Scanner(System.in);

        int n1=inp.nextInt();
        int n2=n1;

        System.out.println("The value of number is "+ n1+" on post increment  the value will be \n "+ n2++ +"\n");
        System.out.println("The value of the variable after the post increment is   \n "+ n2 +"\n");

        System.out.println("The value of number is "+ n1+" on pre increment  the value will be\n "+ ++n1+"\n");


    }
}
