/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        // Point P
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Point A
        double x1 = 0;
        double y1 = 0;

        // Point B
        double x2 = 0;
        double y2 = 100;

        // Point C
        double x3 = 200;
        double y3 = 0;

        // Calculate area for ABC
        double A = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);

        // Calculate area for PBC
        double A1 = Math.abs((x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2)) / 2);

        // Calculate area for APC
        double A2 = Math.abs((x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y)) / 2);

        // Calculate area for ABP
        double A3 = Math.abs((x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2)) / 2);

        if(A1 + A2 + A3 == A)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
