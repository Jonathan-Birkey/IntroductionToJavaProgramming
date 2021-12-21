/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();

        double packageOneUnitPrice = p1 / w1;
        double packageTwoUnitPrice = p2 / w2;

        if(packageOneUnitPrice < packageTwoUnitPrice)
            System.out.print("Package 1 has a better price.");
        if(packageOneUnitPrice > packageTwoUnitPrice)
            System.out.print("Package 2 has a better price.");
        else
            System.out.print("Two package have the same price.");
    }
}
