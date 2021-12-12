/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise2.17
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is
 * not enough to provide the answer. Other factors including wind speed, relative hu-
 * midity, and sunshine play important roles in determining coldness outside. In 2001,
 * the National Weather Service (NWS) implemented the new wind-chill temperature
 * to measure the coldness using temperature and wind speed. The formula is
 * t_wc = 35.74 + 0.6215t_a - 35.75v^0.16 + 0.4275t_av^0.16
 * where t_a is the outside temperature measured in degrees Fahrenheit, v is the speed
 * measured in miles per hour, and t_wc is the wind-chill temperature. The formula cannot
 * be used for wind speeds below 2 mph or temperatures below - 58°F or above 41°F.
 * Write a program that prompts the user to enter a temperature between -58°F
 * and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill
 * temperature. Use Math.pow(a, b) to compute v^0.16. Here is a sample run:
 * Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
 * Enter the wind speed (>= 2) in miles per hour: 6
 * The wind chill index is -5.56707
 *
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t_a = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double v = input.nextDouble();
        double t_wc = 35.74 + (0.6215 * t_a) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * t_a * Math.pow(v, 0.16));
        System.out.printf("The wind chill index is %f", t_wc);
    }
}
