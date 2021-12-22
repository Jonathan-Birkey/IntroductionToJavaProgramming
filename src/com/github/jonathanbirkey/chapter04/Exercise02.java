/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());


        double d = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.printf("The distance between the two points is %f km", d);
    }
}
