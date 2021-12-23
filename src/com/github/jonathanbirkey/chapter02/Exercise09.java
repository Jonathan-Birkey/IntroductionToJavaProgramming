/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise 2.9
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as given by the following formula:
 *
 * a = v_1 - v_0 / t
 *
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * then displays the average acceleration. Here is a sample run:
 *
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        input.close();

        double a = (v1 - v0) / t;
        System.out.printf("The average acceleration is %f", a);
    }
}
