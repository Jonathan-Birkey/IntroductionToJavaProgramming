/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 *
 * Exercise3.22
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle,
 * as shown in Figure 3.7a. (Hint: A point is in the circle is its distance to (0, 0) is less
 * than or equal to 10. The formula for computing the distance is sqrt((x2 -x1)^2 + (y2 - y1)^2).
 * Test your program to cover all cases.) Two sample runs are shown below:
 *
 * Enter a point with two coordinates: 4 5
 * Point (4.0, 5.0) is in the circle
 *
 * Enter a point with two coordinates: 9 9
 * Point (9.0, 9.0) is not in the circle
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        double distance = Math.pow(Math.pow(x - 0, 2) + Math.pow(y - 0, 2), 0.5);
        if(distance <= 10)
            System.out.printf("Point (%.2f, %.2f) is in the circle", x, y);
        else
            System.out.printf("Point (%.2f, %.2f) is not in the circle", x, y);
    }
}
