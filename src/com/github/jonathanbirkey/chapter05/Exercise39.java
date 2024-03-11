/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Financial application: find the sales amount) You have just started a sales job in a
 *     department store. Your pay consists of a base salary and a commission. The base salary is
 *     $5,000. The scheme shown below is used to determine the commission rate.
 *     <p>Sales Amount - Commission Rate
 *     <p>$0.01–$5,000 - 8%
 *     <p>$5,000.01–$10,000 - 10%
 *     <p>$10,000.01 and above - 12%
 *     <p>Note this is a graduated rate. The rate for the first $5,000 is at 8%, the next $5,000 is
 *     at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission is 5,000 * 8 +
 *     5,000 * 10 + 15,000 * 12 = 2,700
 *     <p>Your goal is to earn $30,000 a year. Write a program that finds out the minimum number of
 *     sales you have to generate in order to make $30,000.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise39 {
  public static void main(String[] args) {
    double baseSalary = 5000;
    double commission = 0;
    double desiredEarnings = 30000;
    double sales = 0;

    while (commission + baseSalary < desiredEarnings) {
      if (sales <= 5000) {
        commission = sales * 0.08;
      } else if (sales <= 10000) {
        commission = (5000 * 0.08) + ((sales - 5000) * 0.10);
      } else {
        commission = (5000 * 0.08) + (5000 * .10) + ((sales - 10000) * 0.12);
      }
      sales++;
    }
    System.out.printf("You would need to make $%.2f in sales to make at least $30,0000.", sales);
  }
}