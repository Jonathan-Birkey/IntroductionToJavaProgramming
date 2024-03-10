/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Decimal to octal) Write a program that prompts the user to enter a decimal integer and
 *     displays its corresponding octal value. Don’t use Java’s Integer.toOctalString(int) in this
 *     program.
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise38 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal integer: ");
    int decimal = input.nextInt();
    input.close();

    int count = 0;
    int octalNum = 0;

    while (decimal > 0) {
      octalNum += decimal % 8;
      decimal = decimal / 8;
      if (decimal > 0) {
        octalNum = octalNum * 10;
      }

      count++;
    }

    // 127 = 177
    // 127 ÷ 8 = 15(Quotient) and (7)Remainder
    for (int i = 0; i < count; i++) {
      System.out.printf("%d", octalNum % 10);
      octalNum = octalNum / 10;
    }
  }
}
