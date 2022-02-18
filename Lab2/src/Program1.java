// Write a program to find the price of
// a laptop being sold at 15% discount
// whose MRP is 85,000.

public class Program1 {
    public static void main(String[] args) {
        int actual_price = 85000;
        int discount_rate = 15;

        float discount = actual_price * discount_rate / 100;
        float price = actual_price - discount; 
        System.out.println("The laptop will cost " + price + " after the discount is applied.");
    }
}
