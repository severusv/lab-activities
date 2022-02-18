// Write a program to find the circumference
// of a circle whose radius is 21 cm.

public class Program5 {
    public static void main(String[] args) {
        final double pi = Math.PI; // you could use "double pi = 3.14" or "double pi = 22/7" too, both work.
        // I made it a constant, you don't have to though

        int radius = 21;
        double circumference = 2 * pi * radius;

        System.out.println("The circumference of the circle is " + circumference + " cm.");
    }
}
