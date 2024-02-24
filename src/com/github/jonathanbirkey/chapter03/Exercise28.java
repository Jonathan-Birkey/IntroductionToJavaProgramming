/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 *     <p>Exercise 3.28 (Geometry: two rectangles) Write a program that prompts the user to enter
 *     the center x-, y-coordinates, width, and height of two rectangles and determines whether the
 *     second rectangle is inside the first or overlaps with the first, as shown in Figure 3.9. Test
 *     your program to cover all cases. Here are the sample runs:
 *     <p>Enter r1’s center x-, y-coordinates, width, and height: 2.5 4 2.5 43 Enter r2’s center x-,
 *     y-coordinates, width, and height: 1.5 5 0.5 3 r2 is inside r1
 *     <p>Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 5.5 Enter r2’s center x-,
 *     y-coordinates, width, and height: 3 4 4.5 5 r2 overlaps r1
 *     <p>Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 3 Enter r2’s center x-,
 *     y-coordinates, width, and height: 40 45 3 2 r2 does not overlap r1
 */
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise28 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
    double r1X = input.nextDouble();
    double r1Y = input.nextDouble();
    double r1Width = input.nextDouble();
    double r1Height = input.nextDouble();

    System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
    double r2X = input.nextDouble();
    double r2Y = input.nextDouble();
    double r2Width = input.nextDouble();
    double r2Height = input.nextDouble();
    input.close();

    double r1LeftEdge = r1X - (r1Width / 2);
    double r1RightEdge = r1X + (r1Width / 2);
    double r1TopEdge = r1Y + (r1Height / 2);
    double r1BottomEdge = r1Y - (r1Height / 2);

    double r2LeftEdge = r2X - (r2Width / 2);
    double r2RightEdge = r2X + (r2Width / 2);
    double r2TopEdge = r2Y + (r2Height / 2);
    double r2BottomEdge = r2Y - (r2Height / 2);

    if (r2LeftEdge >= r1LeftEdge
        && r2RightEdge <= r1RightEdge
        && r2BottomEdge >= r1BottomEdge
        && r2TopEdge <= r1TopEdge) {
      System.out.print("r2 is inside r1");
    } else if (r2LeftEdge >= r1LeftEdge && r2LeftEdge <= r1RightEdge
        || r2RightEdge <= r1RightEdge && r2RightEdge >= r1LeftEdge
        || r2BottomEdge >= r1BottomEdge && r2BottomEdge <= r1TopEdge
        || r2TopEdge <= r1TopEdge && r2TopEdge >= r1BottomEdge) {
      System.out.print("r2 overlaps r1");
    } else {
      System.out.print("r2 does not overlap r1");
    }
  }
}
