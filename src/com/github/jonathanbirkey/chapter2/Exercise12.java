/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise2.12
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 *
 * length = v^2 / 2a
 *
 * Write a program that prompts the user to enter v in meters/second (m/s) and
 * the acceleration a in meters/second squared (m/s2), then, displays the minimum
 * runway length.
 *
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 **/
package com.github.jonathanbirkey.chapter2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = (v * v) / (2 * a);
        System.out.printf("The minimum runway length for this airplane is %f\n", length);
    }
}
