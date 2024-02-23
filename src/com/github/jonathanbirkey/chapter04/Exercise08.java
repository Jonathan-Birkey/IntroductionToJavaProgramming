/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 *     <p>Exercise 4.8 (Find the character of an ASCII code) Write a program that receives an ASCII
 *     code (an integer between 0 and 127) and displays its character. Here is a sample run:
 *     <p>Enter an ASCII code: 69 The character for ASCII code 69 is E
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code: ");
    int code = input.nextInt();
    input.close();

    System.out.printf("The character for ASCII code %d is %c", code, (char) code);
  }
}
