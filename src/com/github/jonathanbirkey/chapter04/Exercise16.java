/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *
 * Exercise 4.16
 * (Random character) Write a program that displays a random uppercase letter using
 * the Math.random() method.
 **/
package com.github.jonathanbirkey.chapter04;

public class Exercise16 {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 25);
        System.out.printf("Random uppercase letter: %c\n", (char)(randomNumber + 65));
    }
}
