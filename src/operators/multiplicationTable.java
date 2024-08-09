package operators;

import java.util.Scanner;

public class multiplicationTable {
    public void multTable()
    {
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter the number to print its multiplication table: ");
        int n=inp.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println(i+" x "+n+" = "+ i*n);
        }

    }
}
