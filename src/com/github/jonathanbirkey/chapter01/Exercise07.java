/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 07Dec2021
 *
 * Exercise 1.7
 * (Approximate Pi) Pi can be computed using the following formula:
 * Pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 * Write a program that displays the results of 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * and 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13). Use 1.0 instead of 1 in your
 * program.
 **/
package com.github.jonathanbirkey.chapter01;

public class Exercise07 {
    public static void main(String[] args) {
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
    }
}
