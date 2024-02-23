/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.13 (Find the largest n such that n^3 6 12,000) Use a while loop to find the
 *     largest integer n such that n^3 is less than 12,000.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise13 {
  public static void main(String[] args) {
    int n = 0;
    while (true) {
      if (Math.pow(n, 3) > 12000) {
        n--;
        break;
      } else n++;
    }
    System.out.printf("The smallest n such that n^2 > 12,000 is %d", n);
  }
}
