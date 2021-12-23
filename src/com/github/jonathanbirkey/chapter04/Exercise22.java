/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *
 * Exercise 4.22
 * (Check substring) Write a program that prompts the user to enter two strings, and
 * reports whether the second string is a substring of the first string.
 *
 * Enter string s1: ABCD
 * Enter string s2: BC
 * BC is a substring of ABCD
 *
 * Enter string s1: ABCD
 * Enter string s2: BDC
 * BDC is not a substring of ABCD
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.next();
        System.out.print("Enter string s2: ");
        String s2 = input.next();
        input.close();

        if (s1.contains(s2))
            System.out.printf("%s is a substring of %s", s2, s1);
        else
            System.out.printf("%s is not a substring of %s", s2, s1);
    }
}
