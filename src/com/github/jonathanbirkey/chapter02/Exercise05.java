/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 08Dec2021
 *     <p>Exercise 2.5 (Financial application: calculate tips) Write a program that reads the
 *     subtotal and the gratuity rate, then computes the gratuity and total. For example, if the
 *     user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity
 *     and $11.5 as total. Here is a sample run:
 *     <p>Enter the subtotal and gratuity rate: 10 15 The gratuity is $1.5 and the total is $11.5
 */
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    input.close();

    double gratuity_rate = input.nextDouble() / 100;
    double gratuity = subtotal * gratuity_rate;
    double total = subtotal + gratuity;
    System.out.printf("The gratuity is $%.2f and total is $%.2f\n", gratuity, total);
  }
}
