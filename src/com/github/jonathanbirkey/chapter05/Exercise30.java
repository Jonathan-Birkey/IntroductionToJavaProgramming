/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Financial application: compound value) Suppose you save $100 each month into a savings
 *     account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05 / 12 =
 *     0.00417. After the first month, the value in the account becomes
 *     <p>100 * (1 + 0.00417) = 100.417
 *     <p>After the second month, the value in the account becomes
 *     <p>(100 + 100.417) * (1 + 0.00417) = 201.252
 *     <p>After the third month, the value in the account becomes
 *     <p>(100 + 201.252) * (1 + 0.00417) = 302.507
 *     <p>and so on.
 *     <p>Write a program that prompts the user to enter an amount (e.g., 100), the annual interest
 *     rate (e.g., 5), and the number of months (e.g., 6) then displays the amount in the savings
 *     account after the given month.
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise30 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount (e.g., 100): ");
    double monthlySavings = input.nextDouble();
    System.out.print("Enter annual interest rate (e.g., 5): ");
    double annualInterestRate = input.nextDouble();
    double monthlyInterestRate = (annualInterestRate / 100) / 12;
    System.out.print("Enter the number of months (e.g., 6): ");
    int months = input.nextInt();
    input.close();

    double total = 0;

    for (int i = 0; i < months; i++) {
      total = (total + monthlySavings) * (1 + monthlyInterestRate);
    }
    System.out.printf("Amount in savings after %d months: %.3f", months, total);
  }
}
