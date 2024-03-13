/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Computer architecture: bit-level operations) A short value is stored in 16 bits. Write a
 *     program that prompts the user to enter a short integer and displays the 16 bits for the
 *     integer. Here are sample runs:
 *     <p>Enter an integer: 5
 *     <p>The bits are 0000000000000101
 *     <p>
 *     <p>Enter an integer: -5
 *     <p>The bits are 1111111111111011
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise44 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    short decimal = input.nextShort();
    input.close();
    System.out.printf("The bits are %d", decimal);
  }
}
