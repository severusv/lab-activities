import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temprature in Celcius: ");
        int celcius = input.nextInt();
        int kelvin = celcius + 273;

        System.out.println(celcius + " Celcius is equal to " + kelvin + " Kelvin.");
        input.close();
    }
}
