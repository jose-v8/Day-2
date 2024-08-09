import java.util.Scanner;

import Array.arrayInitailizationAndDisplay;
import logical.*;
import Array.*;
import operators.*;

public class Main
{
    public static void main(String[] args)
    {
        int n;

        System.out.println("Select form the list to execute a program");

        System.out.println("\n Logical programs \n ");
        System.out.println("1). Fibbanocci serires");
        System.out.println("2). Perfect number ");
        System.out.println("3). prime number ");
        System.out.println("4). Number reverse");


        System.out.println("\n Array programs \n ");
        System.out.println("99). Array Initialization and Display: ");
        System.out.println("99). Sum and Average of Array Elements");
        System.out.println("33). max min");
        System.out.println("34). array reverse");
        System.out.println("35). Count even and odd in array.");

        Scanner inp = new Scanner(System.in);

        n= inp.nextInt();

        switch (n)
        {
            case 1 ->{fibanacci p =new fibanacci();p.printFibanacci();}
            case 2 ->{perfectnumber p=new perfectnumber();p.checkPerfectNumber();}
            case 3 ->{primenumber p=new primenumber();p.checkPrime();}
            case 4 ->{numberReverse p= new numberReverse();p.printReverseNumber();}
            case 5 ->{couponNumber p= new couponNumber();p.displayDistinct();}
            case 6 ->{stopwatch.stopWatch();}




            case 41->{additionAndSubstraction p =new additionAndSubstraction();p.twoNumAddAndSub();}
            case 42->{multiplicationTable p= new multiplicationTable();p.multTable();}
            case 43 ->{maxOfThree p=new maxOfThree();p.biggestOfThree();}
            case 44 ->{leap_year p=new leap_year();p.leapYear();}
            case 45 ->{compoundAssigners p= new compoundAssigners();p.allAssigners();}
            case 46 ->{postAndPreIncrement p=new postAndPreIncrement();p.postIncrementAndPreIncrement();}
            case 47 ->{bitwiseOperator p=new bitwiseOperator();p.bitwiseOperatorUsage();}
            case 48 ->{bitwiseOperator p=new bitwiseOperator();p.bitshift();}
            case 49 ->{bitwiseOperator p=new bitwiseOperator();p.oddEven();}
            case 50 ->{ternerayOperator p=new ternerayOperator();p.minOfTwoNumberTernery();}


            case 99 ->{arrayInitailizationAndDisplay p =new arrayInitailizationAndDisplay();p.initDisplay();}
            case 991 ->{sumAvgArray p = new sumAvgArray();p.findSumAvg();}
            case 33->{mazMin p=new mazMin();p.findMaxMin();}
            case 34->{arrayReversal p =new arrayReversal();p.printReverseArray();}
            case 35->{countEvenOddArray p=new countEvenOddArray();p.countEvenOdd();}
            case 36 ->{separatePositiveAndNegative p=new separatePositiveAndNegative();p.separatePositiveNegative();}
            case 37 ->{frequencyOfElements p=new frequencyOfElements();p.findFrequencyOfElements();}
            case 38 ->{duplicateElements p=new duplicateElements();p.duplicateElements();}
            case 39 ->{matrixAddition p=new matrixAddition();p.sumOfMatrix();}
            case 40 ->{matrixMultiplication p= new matrixMultiplication();p.productOfMatrix();}




        }




    }
}
