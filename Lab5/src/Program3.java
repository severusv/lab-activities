import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number % 2 == 1) {
            System.out.println(number + " is an odd number.");
        }
        else {
            System.out.println(number + " is an even number.");
        }
    }
}
