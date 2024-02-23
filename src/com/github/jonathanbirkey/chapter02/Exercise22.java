/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *     <p>Exercise 2.22 (Financial application: monetary units) Rewrite Listing 2.10,
 *     ComputeChange.java, to fix the possible loss of accuracy when converting a double value to an
 *     int value. Enter the input as an integer whose last two digits represent the cents. For
 *     example, the input 1156 represents 11 dollars and 56 cents.
 */
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount in int, for example 1156: ");
    int amount = input.nextInt();
    input.close();

    int dollars = amount / 100;
    int cents = amount % 100;
    int numberOfQuarters = cents / 25;
    cents = cents % 25;
    int numberOfDimes = cents / 10;
    cents = cents % 10;
    int numberOfNickels = cents / 5;
    cents = cents % 5;
    int numberOfPennies = cents;

    System.out.printf("Your amount %d consists of\n", amount);
    System.out.printf(" %d dollars\n", dollars);
    System.out.printf(" %d quarters\n", numberOfQuarters);
    System.out.printf(" %d dimes\n", numberOfDimes);
    System.out.printf(" %d nickels\n", numberOfNickels);
    System.out.printf(" %d pennies\n", numberOfPennies);
  }
}
