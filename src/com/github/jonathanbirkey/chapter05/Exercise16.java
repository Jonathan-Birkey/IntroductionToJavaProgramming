/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.16 (Find the factors of an integer) Write a program that reads an integer and
 *     displays all its smallest factors in an increasing order. For example, if the input integer
 *     is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    input.close();
    int d = 2;
    int n = number;
    String divisors = "";
    while (d < n) {
      if (n % d == 0) {
        divisors += d + ", ";
        n = n / d;
        d = 2;
      } else {
        d++;
      }
    }
    System.out.printf("The factors of %d are %s%d", number, divisors, n);
  }
}
