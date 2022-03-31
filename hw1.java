/*Write a program to input three integers and find the sum of the last digit of the numbers.
For example if the inputs are: 12 
 26
 35
Output:
Sum of the last digit of the integers are: 13*/
import java.util.Scanner;
class hw1
{
     public static void main(String[] args) {
    
        int a , b ,c  , s1 , s2 , s3;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the first number ");
            a = sc.nextInt();
            System.out.println("Enter the second number ");
            b = sc.nextInt();
            System.out.println("Enter the third number ");
            c = sc.nextInt();
        }
        s1= a%10;
        s2= b%10;
        s3= c%10;
        int sum = s1+s2+s3;
        System.out.println("The sum of the last 3 digits of your numbers are : "+sum);

        
    }
}