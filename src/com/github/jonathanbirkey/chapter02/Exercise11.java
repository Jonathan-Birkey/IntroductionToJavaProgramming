/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *     <p>Exercise 2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 *     to enter the number of years and display the population after the number of years. Use the
 *     hint in Programming Exercise 1.11 for this program. Here is a sample run of the program:
 *     <p>Enter the number of years: 5 The population in 5 years is 325932969
 */
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of years: ");
    int numOfYears = input.nextInt();
    input.close();

    double currentPopulation = 312032486;
    long secPerYear = 365 * 24 * 60 * 60;
    double birthsPerYear = secPerYear / 7.0;
    double deathsPerYear = secPerYear / 13.0;
    double immigrantsPerYear = secPerYear / 45.0;
    double growthRate = birthsPerYear + immigrantsPerYear - deathsPerYear;
    for (int i = 0; i < numOfYears; i++) {
      currentPopulation += growthRate;
    }
    System.out.printf("The population in %d years is %d", numOfYears, (int) currentPopulation);
  }
}
