/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *
 * Exercise 5.6
 * (Conversion from miles to kilometers) Write a program that displays the following
 * two tables side by side:
 * Miles        Kilometers  |   Kilometers     Miles
 * 1            1.609       |   20             12.430
 * 2            3.218       |   25             15.538
 * ...
 * 9            14.481      |   60             37.290
 * 10           16.090      |   65             40.398
 **/
package com.github.jonathanbirkey.chapter05;

public class Exercise06 {
    public static void main(String[] args) {
        //     %-10s      %-10s         %-5s     %-15s        %s
        //[Miles     ][Kilometers    ][|    ][Kilometers     ]Miles
        System.out.printf("%-10s%-15s%-5s%-15s%s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        int km = 20;
        for(int i = 1; i < 11; i++) {
            System.out.printf("%-10d%-15.3f%-5s%-15d%.3f\n", i, i * 1.609, "|", km, km / 1.609);
            km += 5;
        }
    }
}
