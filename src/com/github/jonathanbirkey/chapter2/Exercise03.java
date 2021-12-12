/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 08Dec2021
 *
 * Exercise2.3
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 *
 * Enter a value for feet: 16.5
 * 16.5 feet is 5.0325 meters
 **/
package com.github.jonathanbirkey.chapter2;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.printf("%s feet is %s meters\n", Double.toString(feet), Double.toString(meters));
    }
}
