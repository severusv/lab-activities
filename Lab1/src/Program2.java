// Write a program to swap two numbers with
// and without a third variable.

public class Program2 {
    public static void main(String[] args) {
        // by using a third variable:
        System.out.println("Swapping two variables by using a third variable: ");
        int a = 2;
        int b = 4;
        int c;

        // these print statements aren't neccesary, I just
        // added them so that I could see what's happening
        System.out.println("before swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = b;
        b = a;
        a = c;

        System.out.println("after swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // without using a third variable:
        System.out.println("Swapping two variables without using a third variable: ");
        int i = 2;
        int j = 4;

        System.out.println("before swapping: ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = i + j;
        j = i - j;
        i = i - j;

        System.out.println("after swapping: ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
