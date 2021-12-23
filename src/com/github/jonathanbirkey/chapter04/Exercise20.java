/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *
 * Exercise 4.20
 * (Process a string) Write a program that prompts the user to enter a string and
 * displays its length and its first character.
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = input.next();
        input.close();
        System.out.printf("String length is %d\nFirst character is %c", userString.length(), userString.charAt(0));
    }
}
