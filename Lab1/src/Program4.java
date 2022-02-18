// Write a program to convert kilometers
// to miles. (HINT: 1km = 0.621 m)

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("Enter the distance is kilometers: ");
        Scanner input = new Scanner(System.in);

        double km;
        km = input.nextInt();

        double mi = km * 0.621;

        System.out.println(km + " km is equal to " + mi + " miles.");
    }
}
