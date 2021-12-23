/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 07Dec2021
 *
 * Exercise 1.10
 * (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
 * and 30 seconds. Write a program that displays the average speed in miles per
 * hour. (Note 1 mile is equal to 1.6 kilometers.)
 **/
package com.github.jonathanbirkey.chapter01;

public class Exercise10 {
    public static void main(String[] args){
        double avg_kph = 14 / ((45.0 * 60.0 + 30.0) / (60.0 * 60.0));
        double avg_mph = avg_kph / 1.6;
        System.out.printf("%f\n", avg_mph);
    }
}
