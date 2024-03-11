/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Financial application: find the sales amount) Rewrite Programming Exercise 5.39 as
 *     follows:
 *     <p>Use a for loop instead of a do-while loop.
 *     <p>Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise42 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter commission sought: ");
    double desiredCommission = input.nextDouble();
    double commission = 0;
    double sales = 0;

    for (int i = 0; commission < desiredCommission; i++) {
      if (sales <= 5000) {
        commission = sales * 0.08;
      } else if (sales <= 10000) {
        commission = (5000 * 0.08) + ((sales - 5000) * 0.10);
      } else {
        commission = (5000 * 0.08) + (5000 * .10) + ((sales - 10000) * 0.12);
      }
      sales = i;
    }

    System.out.printf("You would need to make $%.2f in sales to make at least $%.2f in commision.", sales, desiredCommission);
  }
}
