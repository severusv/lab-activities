// Write a program to divide two numbers
// and find the quotient and remainder.

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number_1 = input.nextInt();
        int number_2 = input.nextInt();

        float quotient = number_1 / number_2;
        float remainder = number_1 % number_2;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        input.close();
    }
}
