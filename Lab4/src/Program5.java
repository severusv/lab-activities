// Write a program to input a number and print
// whether it is even or odd using a ternary
// operator.

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int number;
        String odd_or_even;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = input.nextInt();

        odd_or_even = (number % 2 == 0) ? "is even" : "is odd";
        System.out.println(number + odd_or_even);
    }
}
