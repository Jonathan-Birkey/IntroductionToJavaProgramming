/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 *
 * Exercise3.27
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 * shown below. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle. Here are the sample runs:
 *
 * Enter a point’s x- and y-coordinates: 100.5 25.5
 * The point is in the triangle
 *
 * Enter a point’s x- and y-coordinates: 100.5 50.5
 * The point is not in the triangle
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        // Point P
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        // Point A
        double x1 = 0;
        double y1 = 0;

        // Point B
        double x2 = 0;
        double y2 = 100;

        // Point C
        double x3 = 200;
        double y3 = 0;

        // Calculate area for ABC
        double A = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);

        // Calculate area for PBC
        double A1 = Math.abs((x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2)) / 2);

        // Calculate area for APC
        double A2 = Math.abs((x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y)) / 2);

        // Calculate area for ABP
        double A3 = Math.abs((x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2)) / 2);

        if(A1 + A2 + A3 == A)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
