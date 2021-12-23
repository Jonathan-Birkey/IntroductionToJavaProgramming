/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise2.16
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is
 * Area = (3 * sqrt(3) / 2) * s^2
 * where s is the length of a side. Here is a sample run:
 *
 * Enter the length of the side: 5.5
 * The area of the hexagon is 78.5918
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double s = input.nextDouble();
        input.close();

        double area = (3 * Math.pow(3, .5) / 2) * Math.pow(s, 2);
        System.out.printf("The area of the hexagon is %f", area);
    }
}
