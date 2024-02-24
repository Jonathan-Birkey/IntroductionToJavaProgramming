/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.19 (Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the
 *     ISBN number as a string.
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    String number = input.next();
    input.close();
    char c1 = number.charAt(0);
    int d1 = (int) c1 - 48;
    char c2 = number.charAt(1);
    int d2 = (int) c2 - 48;
    char c3 = number.charAt(2);
    int d3 = (int) c3 - 48;
    char c4 = number.charAt(3);
    int d4 = (int) c4 - 48;
    char c5 = number.charAt(4);
    int d5 = (int) c5 - 48;
    char c6 = number.charAt(5);
    int d6 = (int) c6 - 48;
    char c7 = number.charAt(6);
    int d7 = (int) c7 - 48;
    char c8 = number.charAt(7);
    int d8 = (int) c8 - 48;
    char c9 = number.charAt(8);
    int d9 = (int) c9 - 48;

    int checksum =
        (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
    if (checksum == 10) {
      System.out.printf("%d%d%d%d%d%d%d%d%dX\n", d1, d2, d3, d4, d5, d6, d7, d8, d9);
    } else {
      System.out.printf("%d%d%d%d%d%d%d%d%d%d\n", d1, d2, d3, d4, d5, d6, d7, d8, d9, checksum);
    }
  }
}
