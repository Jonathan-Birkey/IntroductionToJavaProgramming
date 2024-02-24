/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.26 (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 *     java, to fix the possible loss of accuracy when converting a float value to an int value.
 *     Read the input as a string such as "11.56". Your program should extract the dollar amount
 *     before the decimal point, and the cents after the decimal amount using the indexOf and
 *     substring methods.
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount. for example 11.56: ");
    String amount = input.nextLine();
    input.close();

    String numberOfOneDollars;
    if (amount.length() == 3) numberOfOneDollars = "0";
    else numberOfOneDollars = amount.substring(0, amount.length() - 3);

    int remainingAmount = Integer.parseInt(amount.substring(amount.length() - 2));
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    int numberOfPennies = remainingAmount;

    System.out.printf("Your amount %s consists of\n", amount);
    if (Integer.parseInt(numberOfOneDollars) > 1) {
      System.out.printf(" %s dollars\n", numberOfOneDollars);
    } else if (Integer.parseInt(numberOfOneDollars) == 1) {
      System.out.print(" 1 dollar\n");
    }
    if (numberOfQuarters > 1) {
      System.out.printf(" %d quarters\n", numberOfQuarters);
    } else if (numberOfQuarters == 1) {
      System.out.print(" 1 quarter\n");
    }
    if (numberOfDimes > 1) {
      System.out.printf(" %d dimes\n", numberOfDimes);
    } else if (numberOfDimes == 1) {
      System.out.print(" 1 dime\n");
    }
    if (numberOfNickels > 1) {
      System.out.printf(" %d nickels\n", numberOfNickels);
    } else if (numberOfNickels == 1) {
      System.out.print(" 1 nickel\n");
    }
    if (numberOfPennies > 1) {
      System.out.printf(" %d pennies\n", numberOfPennies);
    } else if (numberOfPennies == 1) {
      System.out.print(" 1 penny");
    }
  }
}
