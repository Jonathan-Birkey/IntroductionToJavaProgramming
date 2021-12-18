/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t_a = input.nextDouble();
        if(t_a < -58 || t_a > 41)
            System.out.println("Invalid temperature");
        else {
            System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
            double v = input.nextDouble();
            if(v < 2)
                System.out.println("Invalid wind speed");
            else {
                double t_wc = 35.74 + (0.6215 * t_a) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * t_a * Math.pow(v, 0.16));
                System.out.printf("The wind chill index is %f", t_wc);
            }
        }
    }
}
