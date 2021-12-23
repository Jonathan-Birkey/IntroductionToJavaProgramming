/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 *
 * Exercise4.7
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
 * console format to display two digits after the decimal point. Here is a sample run:
 *
 * Enter the radius of the bounding circle: 100.52
 * The coordinates of five points on the pentagon are
 * (95.60, 31.06)
 * (0.00, 100.52)
 * (−95.60, 31.06)
 * (−58.08, −81.32)
 * (59.08, −81.32)
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        input.close();

        double x1 = radius * Math.cos(Math.PI / 2 - (2 * Math.PI / 5));
        double y1 = radius * Math.sin(Math.PI / 2 - (2 * Math.PI / 5));
        double x2 = radius * Math.cos(Math.PI / 2);
        double y2 = radius * Math.sin(Math.PI / 2);
        double x3 = radius * Math.cos(Math.PI / 2 + (2 * Math.PI / 5));
        double y3 = radius * Math.sin(Math.PI / 2 + (2 * Math.PI / 5));
        double x4 = radius * Math.cos(Math.PI / 2 + 2 * (2 * Math.PI / 5));
        double y4 = radius * Math.sin(Math.PI / 2 + 2 * (2 * Math.PI / 5));
        double x5 = radius * Math.cos(Math.PI / 2 - 2 * (2 * Math.PI / 5));
        double y5 = radius * Math.sin(Math.PI / 2 - 2 * (2 * Math.PI / 5));

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%.2f, %.2f)\n", x1, y1);
        System.out.printf("(%.2f, %.2f)\n", x2, y2);
        System.out.printf("(%.2f, %.2f)\n", x3, y3);
        System.out.printf("(%.2f, %.2f)\n", x4, y4);
        System.out.printf("(%.2f, %.2f)\n", x5, y5);
    }
}
