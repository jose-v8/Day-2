package operators;
import java.util.Scanner;
public class maxOfThree {
    public void biggestOfThree()
    {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1= inp.nextInt();
        System.out.println("Enter the second number");
        int n2= inp.nextInt();
        System.out.println("Enter the third number");
        int n3= inp.nextInt();


        System.out.print("Enter the biggest number among the three is: ");

        int a= n1>n2?((n1>n3)?n1:((n2>n3)?n2:n3)):(n2>n3?n2:(n3>n1)?n3:n1);
        System.out.println(a);
    }
}
