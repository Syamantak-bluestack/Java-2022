import java.util.Scanner;
public class timeconversion {
    public static void main(String args[])
    {
        int ogtime , hours , minutes , seconds ;
        int hourssub  ;
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter the time in seconds : ");
            ogtime=sc.nextInt();

        }

        hours = ogtime/3600;
        hourssub = ogtime - (hours*3600);
        minutes = hourssub/60;
        seconds = ogtime - ((hours*3600)+(minutes*60));

        System.out.println(" Time in hours :  " + hours);
        System.out.println("Time in minutes : " + minutes);
        System.out.println("Time in seconds : " + seconds);


    }

    
}
