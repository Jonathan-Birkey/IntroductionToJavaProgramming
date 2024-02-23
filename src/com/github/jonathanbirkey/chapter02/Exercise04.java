/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 08Dec2021
 *     <p>Exercise 2.4 (Convert pounds into kilograms) Write a program that converts pounds into
 *     kilograms. The program prompts the user to enter a number in pounds, converts it to
 *     kilograms, and displays the result. One pound is 0.454 kilogram. Here is a sample run:
 *     <p>Enter a number in pounds: 55.5 55.5 pounds is 25.197 kilograms
 */
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number in pounds: ");
    double lbs = input.nextDouble();
    input.close();

    double kgs = lbs * 0.454;
    System.out.printf("%s pounds is %s kilograms\n", Double.toString(lbs), Double.toString(kgs));
  }
}
