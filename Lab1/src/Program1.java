// Write a program to input your name, roll number
// grade and mark and print it.

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        String name;
        byte roll_no;
        short mark;
        char grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your roll number: ");
        roll_no = input.nextByte();

        System.out.println("Enter your marks: ");
        mark = input.nextShort();

        System.out.println("Enter your grade: ");
        grade = input.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Roll number " + roll_no);
        System.out.println("Grade: " + grade);
        System.out.println("Marks " + mark);

        input.close();
    }
}