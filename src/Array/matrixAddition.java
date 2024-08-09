package Array;
import java.util.Random;
public class matrixAddition {
    public void sumOfMatrix()
    {
        Random rand=new Random();
        int a= rand.nextInt(1,10);
        int b=rand.nextInt(1,10);

        int[][] arr1= new int[a][b];
        int[][] arr2= new int[a][b];

        System.out.println("The first matrix is ");

        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                arr1[i][j]= rand.nextInt(-500,500);
                System.out.print(arr1[i][j]+"    ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The second  matrix is ");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                arr2[i][j]= rand.nextInt(-500,500);
                System.out.print(arr2[i][j]+"    ");
                arr1[i][j]+=arr2[i][j];

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The result of the sum of the matrix is ");

        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {

                System.out.print(arr1[i][j]+"    ");

            }
            System.out.println();
        }
    }



}
