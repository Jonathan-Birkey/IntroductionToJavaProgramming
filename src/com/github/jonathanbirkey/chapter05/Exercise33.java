/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Perfect number) A positive integer is called a perfect number if it is equal to the sum
 *     of all of its positive divisors, excluding itself. For example, 6 is the first perfect number
 *     because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers <
 *     10,000. Write a program to find all these four numbers.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise33 {
  public static void main(String[] args) {

    for (int i = 1; i < 10000; i++) {
      int sumPosDivisors = 0;
      for (int j = 1; j <= (int) i / 2; j++) {
        if (i % j == 0) {
          sumPosDivisors += j;
        }
      }
      if (i == sumPosDivisors) {
        System.out.printf("Perfect number: %d\n", i);
      }
    }
  }
}
