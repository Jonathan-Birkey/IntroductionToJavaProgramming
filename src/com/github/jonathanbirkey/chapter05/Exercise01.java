/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 5.1 (Count positive and negative numbers and compute the average of numbers)
 *     Write a program that reads an unspecified number of integers, determines how many positive
 *     and negative values have been read, and computes the total and average of the input values
 *     (not counting zeros). Your program ends with the input 0. Display the average as a
 *     floating-point number. Here are sample runs:
 *     <p>Enter an integer, the input ends if it is 0: 1 2 –1 3 0 The number of positives is 3 The
 *     number of negatives is 1 The total is 5.0 The average is 1.25
 *     <p>Enter an integer, the input ends if it is 0: 0 No numbers are entered except 0
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer, the input ends if it is 0: ");
    int data = input.nextInt();
    int numOfPosDigits = 0;
    int numOfNegDigits = 0;
    int numOfDigits = 0;
    double sum = 0;
    while (data != 0) {
      numOfDigits++;
      if (data > 0) {
        numOfPosDigits++;
      } else if (data < 0) {
        numOfNegDigits++;
      }
      sum += data;
      System.out.print("");
      data = input.nextInt();
    }
    System.out.printf(
        "\nThe number of positives is %d\nThe number of negatives is %d\nThe total is %.1f\n"
            + "The average is %.2f",
        numOfPosDigits, numOfNegDigits, sum, sum / numOfDigits);
    input.close();
  }
}
