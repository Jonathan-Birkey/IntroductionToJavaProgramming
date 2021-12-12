/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 07Dec2021
 *
 * Exercise1.8
 *(Area and perimeter of a circle) Write a program that displays the area and pe-
 * rimeter of a circle that has a radius of 5.5 using the following formulas:
 * perimeter = 2 * radius * Pi
 * area = radius * radius * Pi
 **/
package com.github.jonathanbirkey.chapter01;

public class Exercise08 {
    public static void main(String[] args) {
        double radius = 5.5;
        System.out.printf("perimeter = %f\n", 2 * radius * Math.PI);
        System.out.printf("area = %f\n", radius * radius * Math.PI);
    }
}
