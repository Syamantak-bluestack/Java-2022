import java.util.Scanner; 
public class rectangle {
        public static void main(String args [])
        {
            int area , length , breadth , perimeter ;
            try (Scanner sc = new Scanner (System.in)) {

                System.out.println("Enter the area : ");
                area = sc.nextInt();
                System.out.println("Enter the length : ");
                length = sc.nextInt();
            }
            breadth = area/length ;
            perimeter = 2*(length+breadth);
            System.out.println("The perimeter of the rectangle is : " + perimeter);
            

        }
    
}
