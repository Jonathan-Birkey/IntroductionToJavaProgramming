/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.14 (Compute the greatest common divisor) Another solution for Listing 5.9 to
 *     find the greatest common divisor of two integers n1 and n2 is as follows: First find d to be
 *     the minimum of n1 and n2, then check whether d, d–1, d–2, ..., 2, or 1 is a divisor for both
 *     n1 and n2 in this order. The first such common divisor is the greatest common divisor for n1
 *     and n2. Write a program that prompts the user to enter two positive integers and displays the
 *     gcd.
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int d = 0;
    System.out.print("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = input.nextInt();
    input.close();
    if (n1 < n2) {
      d = n1;
    } else {
      d = n2;
    }
    while (true) {
      if (n1 % d == 0 && n2 % d == 0) {
        break;
      } else {
        d--;
      }
    }
    System.out.printf("The greatest common divisor of %d and %d is %d", n1, n2, d);
  }
}
