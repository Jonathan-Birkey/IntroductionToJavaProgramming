/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 *     <p>Exercise 3.20 (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
 *     to compute the wind-chill temperature. The formula is valid for temperatures in the range
 *     between -58°F and 41°F and wind speed greater than or equal to 2. Write a program that
 *     prompts the user to enter a temperature and a wind speed. The program displays the wind-chill
 *     temperature if the input is valid; otherwise, it displays a message indicating whether the
 *     temperature and/or wind speed is invalid.
 */
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
    double outsideTemp = input.nextDouble();
    if (outsideTemp < -58 || outsideTemp > 41) {
      System.out.println("Invalid temperature");
    } else {
      System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
      double windSpeed = input.nextDouble();

      if (windSpeed < 2) {
        System.out.println("Invalid wind speed");
      } else {
        double windChill =
            35.74
                + (0.6215 * outsideTemp)
                - (35.75 * Math.pow(windSpeed, 0.16))
                + (0.4275 * outsideTemp * Math.pow(windSpeed, 0.16));
        System.out.printf("The wind chill index is %f", windChill);
      }
    }
    input.close();
  }
}
