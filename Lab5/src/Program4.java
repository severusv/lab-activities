// Write a program to accept mark from a user
// and print the grade as:

// A: 90+
// B: 70-89
// C: 50-69
// D: 50

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int marks;

        Scanner input = new Scanner(System.in);
        marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("A");
        }
        if (marks > 70 && marks < 89) {
            System.out.println("B");
        }
        if (marks > 60 && marks < 69) {
            System.out.println("C");
        }
        if (marks < 50) {
            System.out.println("D");
        }
    }
}
