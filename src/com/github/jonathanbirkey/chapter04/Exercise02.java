/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 *     <p>Exercise 4.2 (Geometry: great circle distance) The great circle distance is the distance
 *     between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
 *     latitude and longitude of two points. The great circle distance between the two points can be
 *     computed using the following formula: d = radius * arccos(sin(x1) * sin(x2) + cos(x1) *
 *     cos(x2) * cos(y1 - y2)) Write a program that prompts the user to enter the latitude and
 *     longitude of two points on the earth in degrees and displays its great circle distance. The
 *     average radius of the earth is 6,371.01 km. Note you need to convert the degrees into radians
 *     using the Math.toRadians method since the Java trigonometric methods use radians. The
 *     latitude and longitude degrees in the formula are for north and west. Use negative to
 *     indicate south and east degrees. Here is a sample run:
 *     <p>Enter point 1 (latitude and longitude) in degrees: 39.55 −116.25 Enter point 2 (latitude
 *     and longitude) in degrees: 41.5 87.37 The distance between the two points is
 *     10691.79183231593 km
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
    double x1 = Math.toRadians(input.nextDouble());
    double y1 = Math.toRadians(input.nextDouble());
    input.close();

    System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
    double x2 = Math.toRadians(input.nextDouble());
    double y2 = Math.toRadians(input.nextDouble());

    double d =
        6371.01
            * Math.acos(
                Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    System.out.printf("The distance between the two points is %f km", d);
  }
}
