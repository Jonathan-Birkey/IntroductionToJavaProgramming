/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *     <p>Exercise 2.18 (Print a table) Write a program that displays the following table. Cast
 *     floating-point numbers into integers. a b pow(a, b) 1 2 1 2 3 8 3 4 81 4 5 1024 5 6 15625
 */
package com.github.jonathanbirkey.chapter02;

public class Exercise18 {
  public static void main(String[] args) {
    System.out.print("a\tb\tpow(a, b)\n");
    System.out.printf("1\t2\t%d\n", (int) Math.pow(1, 2));
    System.out.printf("2\t3\t%d\n", (int) Math.pow(2, 3));
    System.out.printf("3\t4\t%d\n", (int) Math.pow(3, 4));
    System.out.printf("4\t5\t%d\n", (int) Math.pow(4, 5));
    System.out.printf("5\t6\t%d\n", (int) Math.pow(5, 6));
  }
}
