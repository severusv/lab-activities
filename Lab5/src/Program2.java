// Write a program to accept a value from user
// check whether is is a negative number or a
// positive number or zero.

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number > 0)
        {
            System.out.println("The number is positive.");
        }
        else if (number < 0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
    }
}
