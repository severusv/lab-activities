public class Program3 {
    public static void main(String[] args) {
        int principal = 50000;
        byte rate_of_interest = 5;
        byte time = 2;

        // interest = principal x time x rate / 100
        double interest = (principal * time * rate_of_interest)/100;
        System.out.println("Simple interest: " + interest);
    }
}
