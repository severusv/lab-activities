import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        km = input.nextInt();

        double mi = km * 0.621;

        System.out.println(km + " km is equal to " + mi + " miles.");
    }
}
