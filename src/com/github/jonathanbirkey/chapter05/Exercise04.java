/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 5.4 (Conversion from miles to kilometers) Write a program that displays the
 *     following table (note 1 mile is 1.609 kilometers): Miles Kilometers 1 1.609 2 3.218 ... 9
 *     14.481 10 16.090
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise04 {
  public static void main(String[] args) {
    System.out.printf("%-10s%s\n", "Miles", "Kilometers");

    for (int i = 1; i < 11; i++) {
      System.out.printf("%-10d%.3f\n", i, i * 1.609);
    }
  }
}
