import java.util.Scanner ;
public class tempchange {
    public static void main(String args[])
    {
            double f , c ;

            try (Scanner sc = new Scanner (System.in)) {
                System.out.println("Enter the temperature in Farenheit ");
                f = sc.nextDouble();
                c = ((f-32)*5)/9;
                System.out.println("The temperature you gave in farenheit converted to Celsius is : " + c);
                
            }

    }
}
