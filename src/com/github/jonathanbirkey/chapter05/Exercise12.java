/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.12 (Find the smallest n such that n^2 7 12,000) Use a while loop to find the
 *     smallest integer n such that n^2 is greater than 12,000.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise12 {
  public static void main(String[] args) {
    int n = 0;
    while (true) {
      if (Math.pow(n, 2) > 12000) {
        break;
      } else {
        n++;
      }
    }
    System.out.printf("The smallest n such that n^2 > 12,000 is %d", n);
  }
}
