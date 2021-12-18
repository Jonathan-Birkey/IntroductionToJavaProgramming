/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight of the package to be shipped: ");
        int weight = input.nextInt();
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
