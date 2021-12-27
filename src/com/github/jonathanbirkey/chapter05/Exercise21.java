/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *
 * Exercise 5.21
 * (Financial application: compare loans with various interest rates) Write a program
 * that lets the user enter the loan amount and loan period in number of years, and
 * displays the monthly and total payments for each interest rate starting from 5% to
 * 8%, with an increment of 1/8. Here is a sample run:
 *
 * Loan Amount: 10000
 * Number of Years: 5
 *
 * Interest Rate    Monthly Payment     Total Payment
 * 5.000%           188.71              11322.74
 * 5.125%           189.29              11357.13
 * 5.250%           189.86              11391.59
 * ...
 * 7.875%           202.17              12129.97
 * 8.000%           202.76              12165.84
 **/
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numOfYears = input.nextInt();
        input.close();

        double annualInterestRate = 5;
        double totalPeriods = numOfYears * 12;


        System.out.printf("%-20s%-20s%s", "Interest Rate", "Monthly Payment", "Total Payment\n");
        while (annualInterestRate <= 8.0){
            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            double monthlyPayment = loanAmount * (monthlyInterestRate * Math.pow(1+monthlyInterestRate, totalPeriods))
                    / (Math.pow(1+monthlyInterestRate, totalPeriods) - 1);
            double totalPayment = monthlyPayment * totalPeriods;
            System.out.printf("%-5.3f%-15s%-20.2f%.2f\n", annualInterestRate, "%", monthlyPayment, totalPayment);
            annualInterestRate += 0.125;
        }



    }
}
