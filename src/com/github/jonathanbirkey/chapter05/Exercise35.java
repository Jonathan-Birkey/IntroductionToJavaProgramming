/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Summation) Write a program to compute the following summation:
 *     <p>(1/1+sqrt(2)) + (1/sqrt(2)+sqrt(3)) + (1/sqrt(3)+sqrt(4)) + ... + (1/sqrt(624)+sqrt(625))
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise35 {
  public static void main(String[] args) {
    double summation = 0;
    for (int i = 1; i <= 624; i++) {
      summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
    }
    System.out.printf("Summation = %f", summation);
  }
}
