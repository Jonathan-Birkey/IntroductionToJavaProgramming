/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x > 5 || x < -5 || y > 5 || y < -5)
            System.out.printf("Point (%.2f, %.2f) is not in the rectangle", x, y);
        else
            System.out.printf("Point (%.2f, %.2f) is in the rectangle", x, y);
    }
}
