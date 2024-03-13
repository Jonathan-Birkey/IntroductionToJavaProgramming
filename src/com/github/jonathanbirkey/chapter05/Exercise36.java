/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Business application: checking ISBN) Use loops to simplify Programming Exercise 3.9.
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise36 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    int number = input.nextInt();
    input.close();

    int tempNumber = number;
    int leadingZeroCounter = 0;
    int checksum = 0;

    for (int i = 9; i > 0; i--) {
      int digit = tempNumber % 10;
      tempNumber = tempNumber / 10;
      if (digit == 0) {
        leadingZeroCounter++;
      } else {
        leadingZeroCounter = 0;
      }
      checksum += digit * i;
    }

    checksum = checksum % 11;
    System.out.printf("The ISBN-10 number is ");

    if (checksum == 10) {
      for (int j = 0; j < leadingZeroCounter; j++) {
        System.out.print("0");
      }
      System.out.printf("%dX", number);
    } else {
      for (int j = 0; j < leadingZeroCounter; j++) {
        System.out.print("0");
      }
      System.out.printf("%d%d", number, checksum);
    }
  }
}
