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
