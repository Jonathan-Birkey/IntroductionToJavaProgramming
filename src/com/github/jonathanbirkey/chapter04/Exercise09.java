/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 *
 * Exercise 4.9
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode. Here is a sample run:
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        input.close();

        System.out.printf("The Unicode for the character %c is %d", character, (int)character);
    }
}
