/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 11Dec2021
 *
 * Exercise 3.12
 * (Palindrome integer) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome
 * if it reads the same from right to left and from left to right. A negative integer is
 * treated the same as a positive integer. Here are sample runs of this program:
 *
 * Enter a three-digit integer: 121
 * 121 is a palindrome
 *
 * Enter a three-digit integer: 123
 * 123 is not a palindrome
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();
        input.close();
        
        int tempNum = num;
        int digit1 = tempNum % 10;
        tempNum = tempNum / 100;
        int digit3 = tempNum % 10;
        if (digit1 == digit3)
            System.out.printf("%d is a palindrome", num);
        else
            System.out.printf("%d is not a palindrome", num);
    }
}
