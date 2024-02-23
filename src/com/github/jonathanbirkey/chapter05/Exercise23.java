/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 27Dec2021
 *     <p>Exercise 5.23 (Demonstrate cancellation errors) A cancellation error occurs when you are
 *     manipulating a very large number with a very small number. The large number may cancel out
 *     the smaller number. For example, the result of 100000000.0 + 0.000000001 is equal to
 *     100000000.0. To avoid cancellation errors and obtain more accurate results, carefully select
 *     the order of computation. For example, in computing the following summation, you will obtain
 *     more accurate results by computing from right to left rather than from left to right:
 *     <p>1 + 1/2 + 1/3 + ... + 1/n
 *     <p>Write a program that compares the results of the summation of the preceding series,
 *     computing from left to right and from right to left with n = 50000.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise23 {
  public static void main(String[] args) {
    double n = 50000;
    double leftToRight = 1;
    for (double i = 2; i <= n; i++) {
      leftToRight += 1 / i;
    }
    System.out.printf("Summation from left to right: %f\n", leftToRight);

    double rightToLeft = 0;
    for (double j = n; j >= 2; j--) {
      rightToLeft += 1 / j;
    }
    rightToLeft += 1;
    System.out.printf("Summation from right to left: %f\n", rightToLeft);
  }
}
