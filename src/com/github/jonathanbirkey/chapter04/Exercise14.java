/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.14 (Convert letter grade to number) Write a program that prompts the user to
 *     enter a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
 *     1, or 0. For other input, display invalid grade. Here is a sample run:
 *     <p>Enter a letter grade: B The numeric value for grade B is 3
 *     <p>Enter a letter grade: T T is an invalid grade
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter grade: ");
    String grade = input.next();
    input.close();

    switch (grade) {
      case "A":
      case "a":
        System.out.printf("The number value for grade %s is 4", grade);
        break;
      case "B":
      case "b":
        System.out.printf("The number value for grade %s is 3", grade);
        break;
      case "C":
      case "c":
        System.out.printf("The number value for grade %s is 2", grade);
        break;
      case "D":
      case "d":
        System.out.printf("The number value for grade %s is 1", grade);
        break;
      case "F":
      case "f":
        System.out.printf("The number value for grade %s is 0", grade);
        break;
      default:
        System.out.printf("%s is an invalid grade", grade);
    }
  }
}
