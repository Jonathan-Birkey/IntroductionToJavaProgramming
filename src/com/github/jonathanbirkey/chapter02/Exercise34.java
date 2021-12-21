/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if(condition == 0)
            System.out.printf("(%.2f, %.2f) is on the line segment from " +
                    "(%.2f, %.2f) to (%.2f, %.2f)", x2, y2, x0, y0, x1, y1);
        else
            System.out.printf("(%.2f, %.2f) is not on the line segment from " +
                    "(%.2f, %.2f) to (%.2f, %.2f)", x2, y2, x0, y0, x1, y1);
    }
}
