/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double distanceBetweenCenters = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);

        if(distanceBetweenCenters <= r1 - r2)
            System.out.print("circle2 is inside circle1");
        else if(distanceBetweenCenters <= r1 + r2)
            System.out.print("circle2 overlaps circle1");
        else
            System.out.print("circle2 does not overlap circle1");

    }
}
