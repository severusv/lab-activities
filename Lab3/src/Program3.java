// Write a program to convert the number of days
// into years, months and days.
// Example: 400 days will be 1 year, 1 month and 5 days.

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
         System.out.println("Enter the number of days: ");
         Scanner input = new Scanner(System.in);
         int days = input.nextInt();

         int years = days / 365;

    }
}
