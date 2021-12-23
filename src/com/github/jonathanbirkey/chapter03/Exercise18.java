/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 *
 * Exercise3.18
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in pounds).
 *            3.5, if 0 < 2 <= 1
 *     c(w) { 5.5, if 1 < w <= 3
 *            8.5, if 3 < w <= 10
 *            10.5, if 10 < w <= 20
 *
 * Write a program that prompts the user to enter the weight of the package and
 * displays the shipping cost. If the weight is negative or zero, display a message
 * “Invalid input.” If the weight is greater than 20, display a message “The package
 * cannot be shipped.”
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight of the package to be shipped: ");
        int weight = input.nextInt();
        input.close();

        if(weight <= 0)
            System.out.println("Invalid input.");
        else if(weight <= 1)
            System.out.println("Shipped cost is $3.5");
        else if(weight <= 3)
            System.out.println("Shipped cost is $5.5");
        else if(weight <= 10)
            System.out.println("Shipped cost is $8.5");
        else if(weight <= 20)
            System.out.println("Shipped cost is $10.5");
        else
            System.out.println("The package cannot be shipped.");
    }
}
