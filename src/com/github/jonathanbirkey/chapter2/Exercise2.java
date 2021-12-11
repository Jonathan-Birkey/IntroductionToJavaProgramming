/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 08Dec2021
 *
 * Exercise2.2
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 *
 * area = radius * radius * Pi
 * volume = area * length
 *
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12
 * The area is 95.0331
 * The volume is 1140.4
 **/
package com.github.jonathanbirkey.chapter2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %s\n", Double.toString(area));
        System.out.printf("The volume is %s\n", Double.toString(volume));
    }
}
