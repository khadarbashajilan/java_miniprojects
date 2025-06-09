import java.util.*;
public class compoundInterestcalc {
    // Compound Interest Calculator
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double principal;
        int years;
        double amount;
        double rate;
        int timescompounded;
        
        System.out.print("Enter the Principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year: ");
        timescompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount= principal * Math.pow(1+ rate/timescompounded, timescompounded * years);

        System.out.printf("The amount after %d years is $ %.2f",years,amount);

        scanner.close();
    }
}
