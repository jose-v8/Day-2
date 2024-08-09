package logical;
import java.util.Scanner;
public class fibanacci {
    public void printFibanacci()
    {
        System.out.print("Enter the number of elements to be printed of series");
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();

        int f=0,s=1,t;
  //  0 1 1f,temp 2s 3 5 7
        if (n>=3)
        {
            System.out.print(f+" "+s+" ");
            int i=3;
            while(i<=n)
            {
                t=f+s;
                System.out.print(t+" ");
                int temp= s;
                s=t;
                f=temp;
                i+=1;
            }
        } else if (n==1) {
            System.out.println(f);

        } else if (n==2) {
            System.out.print(f+" "+s+" ");

        }


    }
}
