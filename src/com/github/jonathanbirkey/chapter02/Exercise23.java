/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise2.23
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
 * then displays the cost of the trip. Here is a sample run:
 *
 * Enter the driving distance: 900.5
 * Enter miles per gallon: 25.5
 * Enter price per gallon: 3.55
 * The cost of driving is $125.36
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double miles = input.nextDouble();
        System.out.print("Enter the miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter the price per gallon: ");
        double dollarPerGal = input.nextDouble();
        double cost = (miles / mpg) * dollarPerGal;
        System.out.printf("The cost of driving is $%.2f", cost);
    }
}
