package Array;

public class arrayInitailizationAndDisplay {
    public void initDisplay()
    {

        int[] arr = new int[5];

//        int[] arr = {123,456,12,34,6,7,8};

        int i=0;
        for (int items:arr) {
            i+=1;
            System.out.println("The element on the postition "+i+" is "+ items);
        }
    }


}
