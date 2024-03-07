/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Financial application: compute CD value) Suppose you put $10,000 into a CD with an annual
 *     percentage yield of 5.75%. After one month, the CD is worth
 *     <p>10000 + 10000 * 5.75 / 1200 = 10047.92
 *     <p>After two months, the CD is worth
 *     <p>10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
 *     <p>After three months, the CD is worth
 *     <p>10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
 *     <p>and so on.
 *     <p>Write a program that prompts the user to enter an amount (e.g., 10000), the annual
 *     percentage yield (e.g., 5.75), and the number of months (e.g., 18) and displays a table as
 *     presented in the sample run.
 *     <p>Enter the initial deposit amount: 10000
 *     <p>Enter annual percentage yield: 5.75
 *     <p>Enter maturity period (number of months): 18
 *     <p>Month CD Value
 *     <p>1 100047.92
 *     <p>2 10096.06
 *     <p>...
 *     <p>17 10846.57
 *     <p>18 10898.54
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the initial deposit amount: ");
    double amount = input.nextDouble();
    System.out.print("Enter annual percentage yield: ");
    double APY = input.nextDouble();
    System.out.print("Enter maturity period (number of months): ");
    int months = input.nextInt();
    input.close();

    System.out.printf("Month\tCD Value\n");

    for (int i = 1; i <= months; i++) {
      amount = amount + (amount * (APY / 1200));
      System.out.printf("%-7d %.2f\n", i, amount);
    }
  }
}
