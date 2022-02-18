import java.util.Scanner;
import java.lang.Math;

public class Program5 {
    public static void main(String[] args) {
        // Area
        int length;
        int breadth;

        Scanner input = new Scanner(System.in);
        System.out.println("Length in cm: ");
        length = input.nextInt();
        System.out.println("Breadth in cm: ");
        breadth = input.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        double diagonal_squared = (length * length) + (breadth * breadth);
        double diagonal = Math.sqrt(diagonal_squared);

        System.out.println("The area of that rectangle is " + area + " cm.");
        System.out.println("The perimeter of that rectangle is " + perimeter + " cm.");
        System.out.println("The length of its diagonal is " + diagonal + " cm.");
        input.close();

    }
}
