/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 14Dec2021
 *
 * Exercise 3.16
 * (Random point) Write a program that displays a random coordinate in a
 * rectangle. The rectangle is centered at (0, 0) with width 100 and height 200.
 **/
package com.github.jonathanbirkey.chapter03;

public class Exercise16 {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 100) - 50;
        int y = (int)(Math.random() * 200) - 100;
        System.out.printf("(%d, %d)\n", x, y);
    }
}
