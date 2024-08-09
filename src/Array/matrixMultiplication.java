package Array;
import java.util.Random;

public class matrixMultiplication {
    public void productOfMatrix()

    {
        int a,b,c;
        Random rand=new Random();
        a=rand.nextInt(2,3);
        c=rand.nextInt(4,5);
        b=rand.nextInt(2,3);

        System.out.println("The first array is :");
        int[][] arr1= new int[a][c];
        int[][] arr2= new int[c][b];
        int[][] res=new int[a][b];


        for (int i=0;i<a;i++)
        {
            for (int j=0;j<c;j++)
            {
                arr1[i][j]=rand.nextInt(1,3);
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("The second array is ");
        for (int i=0;i<c;i++)
        {
            for (int j=0;j<b;j++)
            {
                arr2[i][j]=rand.nextInt(1,3);
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        int sum=0;
        System.out.println("The product of two matrixes is :");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                for (int z=0;z<c;z++)
                {
//                    int n=arr1[i][z]*arr2[j][z];
                    sum+=arr1[i][z]*arr2[z][j];

                }
                res[i][j]=sum;
                System.out.print(sum+" ");
                sum=0;
            }
            System.out.println();
        }



    }
}
