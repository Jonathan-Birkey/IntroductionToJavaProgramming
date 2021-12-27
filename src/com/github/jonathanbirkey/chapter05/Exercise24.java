/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 27Dec2021
 *
 * Exercise 5.24
 * (Sum a series) Write a program to compute the following summation:
 *
 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
 **/
package com.github.jonathanbirkey.chapter05;

public class Exercise24 {
    public static void main(String[] args) {
        double summation = 0;
        for(int i = 1; i < 100; i += 2) {
            summation += i/(i + 2.0);
        }
        System.out.printf("The summation is %f", summation);
    }
}
