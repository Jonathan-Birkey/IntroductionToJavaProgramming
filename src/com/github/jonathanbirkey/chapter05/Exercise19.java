/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.19 (Display numbers in a pyramid pattern) Write a nested for loop that prints
 *     the following output: 1 1 2 1 1 2 4 2 1 1 2 4 8 4 2 1 1 2 4 8 16 8 4 2 1 1 2 4 8 16 32 16 8 4
 *     2 1 1 2 4 8 16 32 64 32 16 8 4 2 1 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise19 {
  public static void main(String[] args) {
    int numOfLines = 8;
    for (int i = 1; i <= numOfLines; i++) {
      for (int j = 1; j <= numOfLines - i; j++) {
        System.out.print("    ");
      }
      for (int k = 1; k <= numOfLines; k++) {
        if (k <= i) {
          System.out.printf("%4d", (int) Math.pow(2, k - 1));
        }
      }
      for (int l = numOfLines - 1; l > 0; l--) {
        if (l < i) {
          System.out.printf("%4d", (int) Math.pow(2, l - 1));
        }
      }
      System.out.print("\n");
    }
  }
}

