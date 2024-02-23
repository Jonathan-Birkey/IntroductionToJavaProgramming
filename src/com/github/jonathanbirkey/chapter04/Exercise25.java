/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.25 (Generate vehicle plate numbers) Assume that a vehicle plate number consists
 *     of three uppercase letters followed by four digits. Write a program to generate a plate
 *     number.
 */
package com.github.jonathanbirkey.chapter04;

public class Exercise25 {
  public static void main(String[] args) {
    char l1 = (char) (Math.random() * 25 + 65);
    char l2 = (char) (Math.random() * 25 + 65);
    char l3 = (char) (Math.random() * 25 + 65);
    char d1 = (char) (Math.random() * 10 + 48);
    char d2 = (char) (Math.random() * 10 + 48);
    char d3 = (char) (Math.random() * 10 + 48);
    char d4 = (char) (Math.random() * 10 + 48);
    System.out.printf("Plate number is %c%c%c%c%c%c%c", l1, l2, l3, d1, d2, d3, d4);
  }
}
