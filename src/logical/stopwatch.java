package logical;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalTime;
public  class stopwatch {
    public static void stopWatch()
    {
        LocalTime cur1=null,cur2=null;
        System.out.println("This is a stopwatch program\nInstructions\nInput any key to start the stopwatch or to stop");
        Scanner inp=new Scanner(System.in);
        String a=inp.next();
        System.out.println("Started...");

        if (a!=null)
        {
            cur1= LocalTime.now();

        }
        String b=inp.next();

        if (b!=null)
        {
            cur2= LocalTime.now();

        }

        long hours = ChronoUnit.HOURS.between(cur1, cur2);
        long minutes=ChronoUnit.MINUTES.between(cur1,cur2);
        long seconds=ChronoUnit.SECONDS.between(cur1,cur2);

        System.out.println("The time difference is "+hours+" Hours "+minutes+" minutes "+seconds+" seconds");





    }

}
