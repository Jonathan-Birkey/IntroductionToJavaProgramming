/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the
 *     numbers from 100 to 1,000 (10 per line) that are divisible by 5 and 6. Numbers are separated
 *     by exactly one space.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise10 {
  public static void main(String[] args) {
    int charCount = 0;
    for (int i = 100; i <= 1000; i++) {
      if (charCount == 10) {
        System.out.print("\n");
        charCount = 0;
      }
      if (i % 5 == 0 && i % 6 == 0) {
        System.out.printf("%d ", i);
        charCount++;
      }
    }
  }
}
