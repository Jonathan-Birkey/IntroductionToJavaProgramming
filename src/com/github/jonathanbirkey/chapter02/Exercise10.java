/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *     <p>Exercise 2.10 (Science: calculating energy) Write a program that calculates the energy
 *     needed to heat water from an initial temperature to a final temperature. Your program should
 *     prompt the user to enter the amount of water in kilograms and the initial and final
 *     temperatures of the water. The formula to compute the energy is
 *     <p>Q = M * (finalTemperature - initialTemperature) * 4184
 *     <p>where M is the weight of water in kilograms, initial and final temperatures are in degrees
 *     Celsius, and energy Q is measured in joules. Here is a sample run:
 *     <p>Enter the amount of water in kilograms: 55.5 Enter the initial temperature: 3.5 Enter the
 *     final temperature: 10.5 The energy needed is 1625484.0
 */
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the amount of water in kilograms: ");
    double M = input.nextDouble();
    System.out.print("Enter the initial temperature: ");
    double initialTemp = input.nextDouble();
    System.out.print("Enter the final temperature: ");
    double finalTemp = input.nextDouble();
    input.close();

    double Q = M * (finalTemp - initialTemp) * 4184;
    System.out.printf("The energy needed is %s", Double.toString(Q));
  }
}
