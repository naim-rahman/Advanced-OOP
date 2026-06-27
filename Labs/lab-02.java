// Problem Statement

// A bank wants to calculate interest for different types of deposits. The interest calculation should work with:

// Principal amount only.
// Principal amount and time period.
// Principal amount, time period, and interest rate.

// Implement the calculateInterest() method using method overloading to demonstrate compile-time polymorphism in Java.



import java.util.Scanner;

class Bank {
    double rate = 5;

    void calculateInterest(double principal) {
        double interest = principal * rate / 100;
        System.out.println("Interest for " + rate + "% = " + interest);
    }

    void calculateInterest(double principal, int time) {
        double interest = principal * time * rate / 100;
        System.out.println("Interest for " + rate + "% = " + interest);
    }

    void calculateInterest(double principal, int time, double rate) {
        double interest = principal * time * rate / 100;
        System.out.println("Interest for " + rate + "% = " + interest);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter Principal for 5% interest: ");
        double p1 = sc.nextDouble();
        b.calculateInterest(p1);

        System.out.print("\nEnter Principal and Time 5% interest: ");
        double p2 = sc.nextDouble();
        int t2 = sc.nextInt();
        b.calculateInterest(p2, t2);

        System.out.print("\nEnter Principal, Time and interest Rate: ");
        double p3 = sc.nextDouble();
        int t3 = sc.nextInt();
        double r3 = sc.nextDouble();
        b.calculateInterest(p3, t3, r3);

        sc.close();
    }
}



// This experiment demonstrated **method overloading (compile-time polymorphism)** by calculating interest using different parameter lists. An initial interest rate of **5%** was assumed for the default calculations.
