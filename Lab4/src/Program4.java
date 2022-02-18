// Write a program to input a number
// and print whether it is even or
// odd using a ternary operator.

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int number_1, number_2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number_1 = input.nextInt();

        System.out.println("Enter another number: ");
        number_2 = input.nextInt();

        int smaller_number;
        smaller_number = (number_1 < number_2) ? number_1 : number_2;
        System.out.println("The smaller number is " + smaller_number);
    }
}