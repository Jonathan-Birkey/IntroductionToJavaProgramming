/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 27Dec2021
 *
 * Exercise 5.22
 * (Financial application: loan amortization schedule) The monthly payment for a given
 * loan pays the principal and the interest. The monthly interest is computed by multiplying
 * the monthly interest rate and the balance (the remaining principal). The principal paid
 * for the month is therefore the monthly payment minus the monthly interest. Write a program
 * that lets the user enter the loan amount, number of years, and interest rate then displays
 * the amortization schedule for the loan. Here is a sample run:
 *
 * Loan Amount: 10000
 * Number of Years: 1
 * Annual Interest Rate: 7
 *
 * Payment#     Interest    Principal       Balance
 * 1               58.33       806.93        9193.07
 * 2               53.62       811.64        8381.43
 * ...
 * 11              10.00       855.26         860.27
 * 12              5.01        860.25           0.01
 **/
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double principal = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interest = input.nextDouble();
        input.close();
        double totalPeriods = numberOfYears * 12;
        double monthlyInterestRate = (interest / 100) / 12;

        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1+monthlyInterestRate, totalPeriods))
                / (Math.pow(1+monthlyInterestRate, totalPeriods) - 1);
        double balance = monthlyPayment * totalPeriods;

        System.out.printf("\nMonthly Payment: %.2f\nTotal Payment: %.2f\n\n",monthlyPayment, balance);
        System.out.printf("%-15s%-15s%-15s%s\n", "Payment#", "Interest", "Principal", "Balance");
        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-15d%-15.2f%-15.2f%.2f\n", i, interest, principal, balance);
        }
    }
}
