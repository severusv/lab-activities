public class Program4 {
    public static void main(String[] args) {
        double basic_salary = 75000.0;
        double allowance = 0.4 * basic_salary;
        double pf = 0.1 * basic_salary;

        double net_pay = basic_salary + allowance;
        double gross_pay = net_pay - pf;

        System.out.println("The net pay is " + net_pay);
        System.out.println("The gross pay is " + gross_pay);
    }
}
