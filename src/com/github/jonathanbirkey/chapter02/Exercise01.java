/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 08Dec2021
 *     <p>Exercise 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree
 *     in a double value from the console, then converts it to Fahrenheit, and displays the result.
 *     The formula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32 Hint: In
 *     Java, 9 / 5 is 1, but 9.0 / 5 is 1.8. Here is a sample run:
 *     <p>Enter a degree in Celsius: 43.5 43.5 Celsius is 110.3 Fahrenheit
 */
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();
    input.close();

    double fahrenheit = (9.0 / 5.0) * celsius + 32;
    System.out.printf(
        "%s Celsius is %s Fahrenheit", Double.toString(celsius), String.valueOf(fahrenheit));
  }
}
