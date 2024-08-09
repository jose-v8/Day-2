package logical;
import java.util.Scanner;

public class compoundAssigners {
    public void allAssigners()
    {
        System.out.println("Enter a number to display all the compound assignment  operators (+=, -=, *=, /=, %=).");
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the  num: ");
        int n1=inp.nextInt();
        int n2=n1;

        System.out.println("The usage of += is \n The value of number is "+ n1+" n+=1 will increment the value \n "+ (n2+=1)+"\n");
        System.out.println("The usage of += is \n The value of number is "+ n1+" n-=1 will decrement the value \n "+ (n2-=1)+"\n");
        System.out.println("The usage of += is \n The value of number is "+ n1+" n*=2 will multiply the numeber with 2 and will store in the same variable , the value  is \n "+ (n2*=2)+"\n");
        System.out.println("The usage of += is \n The value of number is "+ n1+" n/=2 will divide the numeber with 2 and will store in the same variable , the value  is \n "+ (n2/=2)+"\n");
        System.out.println("The usage of += is \n The value of number is "+ n1+" n%=2 will perform number modulo  2 and  remainder will store in the same variable , the value  is \n "+ (n2%=2)+"\n");

    }

}

