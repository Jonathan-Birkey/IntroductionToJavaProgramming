/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise3.1
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax^2 + bx + c = 0 can be obtained using the following formula:
 * r1 = (-b + sqrt(b^2 - 4ac)) / 2a and r2 = (-b - sqrt(b^2 - 4ac))
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is nega-
 * tive, the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display "The equation
 * has no real roots."
 * Note you can use Math.pow(x, 0.5) to computer sqrt(x). Here are some sample
 * runs:
 *
 * Enter a, b, c: 1.0 3 1
 * The equation has two roots -0.381966 and -2.61803
 *
 * Enter a, b, c: 1 2.0 1
 * The equation has one root -1.0
 *
 * Enter a, b, c: 1 2 3
 * The equation has no real roots
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();
        double r1 = 0;
        double r2 = 0;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if(discriminant > 0) {
            r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            r2 = ((-1 * b) - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.printf("The equation has two roots %f and %f", r1, r2);
        } else if(discriminant == 0) {
            r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.printf("The equation has one root %f", r1);
        } else {
            System.out.print("The equation has no real roots");
        }
    }
}
