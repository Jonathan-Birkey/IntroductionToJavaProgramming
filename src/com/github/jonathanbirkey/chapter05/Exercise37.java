/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Decimal to binary) Write a program that prompts the user to enter a decimal integer then
 *     displays its corresponding binary value. Don’t use Java’s Integer.toBinaryString(int) in this
 *     program.
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise37 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal integer: ");
    int decimal = input.nextInt();
    input.close();

    int count = 0;
    int binary = 0;

    while (decimal > 0) {
      if (decimal % 2 == 0) {
        binary += 0;
      } else {
        binary += 1;
      }
      decimal = decimal / 2;
      if (decimal > 0) {
        binary = binary * 10;
      }

      count++;
    }

    for (int i = 0; i < count; i++) {
      System.out.printf("%d", binary % 10);
      binary = binary / 10;
    }
  }
}
