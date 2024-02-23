/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 *     <p>Exercise 3.33 (Financial: compare costs) Suppose you shop for rice in two different
 *     packages. You would like to write a program to compare the cost. The program prompts the user
 *     to enter the weight and price of each package and displays the one with the better price.
 *     Here is a sample run:
 *     <p>Enter weight and price for package 1: 50 24.59 Enter weight and price for package 2: 25
 *     11.99 Package 2 has a better price.
 *     <p>Enter weight and price for package 1: 50 25 Enter weight and price for package 2: 25 12.5
 *     Two packages have the same price.
 */
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter weight and price for package 1: ");
    double w1 = input.nextDouble();
    double p1 = input.nextDouble();

    System.out.print("Enter weight and price for package 2: ");
    double w2 = input.nextDouble();
    double p2 = input.nextDouble();
    input.close();

    double packageOneUnitPrice = p1 / w1;
    double packageTwoUnitPrice = p2 / w2;

    if (packageOneUnitPrice < packageTwoUnitPrice)
      System.out.print("Package 1 has a better price.");
    if (packageOneUnitPrice > packageTwoUnitPrice)
      System.out.print("Package 2 has a better price.");
    else System.out.print("Two package have the same price.");
  }
}
