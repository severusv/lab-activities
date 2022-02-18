// Write a program to find the sum, difference
// and product of two numbers taken as input.

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number_1 = input.nextInt();

        System.out.println("Enter another number: ");
        int number_2 = input.nextInt();

        int sum = number_1 + number_2;
        int product = number_1 * number_2;
        int difference = number_2 - number_1;

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
        System.out.println("The difference is " + difference);

        input.close();
    }
}
