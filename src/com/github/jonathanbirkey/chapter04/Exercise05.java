/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 *
 * Exercise 4.5
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all angles have the same degree (i.e.,
 * the polygon is both equilateral and equiangular). The formula for computing the
 * area of a regular polygon is
 * Area = n * s^2 / 4 * tan(Pi/n)
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area. Here
 * is a sample run:
 *
 * Enter the number of sides: 5
 * Enter the side: 6.5
 * The area of the polygon is 72.69017017488385
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        input.close();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.printf("The area of the polygon is %f", area);
    }
}
