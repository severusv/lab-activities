public class Program2 {
    public static void main(String[] args) {
        int base = 8;
        int height = 15;

        double hypotenuse_squared = (base * base) + (height * height);
        double hypotenuse = Math.sqrt(hypotenuse_squared);

        double perimeter = base + height + hypotenuse;
        double area = 0.5 * (base * height);

        System.out.println("The perimeter is " + perimeter + " cm.");
        System.out.println("The area is " + area + " square cm.");
        System.out.println("The length of the hypotenuse is " + hypotenuse + " cm.");
    }
}
