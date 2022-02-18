import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("Enter the temprature in Celcius: ");
        Scanner input = new Scanner(System.in);

        int celcius = input.nextInt();
        int farenheit = celcius * 9/5 + 32;

        System.out.println("The temprature in Farenheit is " + farenheit);
        input.close();
    }
}
