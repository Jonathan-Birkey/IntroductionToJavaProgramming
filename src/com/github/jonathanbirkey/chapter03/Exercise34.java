/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 *     <p>Exercise 3.34 (Geometry: point on line segment) Exercise 3.32 shows how to test whether a
 *     point is on an unbounded line. Revise Exercise 3.32 to test whether a point is on a line
 *     segment. Write a program that prompts the user to enter the three points for p0, p1, and p2
 *     and displays whether p2 is on the line segment from p0 to p1. Here are some sample runs:
 *     <p>Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5 (1.5, 1.5) is on the line
 *     segment from (1.0, 1.0) to (2.5, 2.5)
 *     <p>Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5 (3.5, 3.5) is not on the line
 *     segment from (1.0, 1.0) to (2.0, 2.0)
 */
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise34 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three points for p0, p1, and p2: ");
    double x0 = input.nextDouble();
    double y0 = input.nextDouble();
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    input.close();

    double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    if (condition == 0)
      System.out.printf(
          "(%.2f, %.2f) is on the line segment from " + "(%.2f, %.2f) to (%.2f, %.2f)",
          x2, y2, x0, y0, x1, y1);
    else
      System.out.printf(
          "(%.2f, %.2f) is not on the line segment from " + "(%.2f, %.2f) to (%.2f, %.2f)",
          x2, y2, x0, y0, x1, y1);
  }
}
