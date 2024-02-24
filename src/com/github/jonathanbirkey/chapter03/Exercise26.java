/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 *     <p>Exercise 3.26 (Use the &&, ||, and ^ operators) Write a program that prompts the user to
 *     enter an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 *     by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run of this
 *     program:
 *     <p>Enter an integer: 10 Is 10 divisible by 5 and 6? false Is 10 divisible by 5 or 6? true Is
 *     10 divisible by 5 or 6, but not both? true
 */
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    input.close();

    System.out.printf("Is %d divisible by 5 and 6? ", num);
    if (num % 5 == 0 && num % 6 == 0) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    System.out.printf("Is %d divisible by 5 or 6? ", num);
    if (num % 5 == 0 || num % 6 == 0) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    System.out.printf("Is %d divisible by 5 or 6, but not both? ", num);
    if ((num % 5 == 0 || num % 6 == 0) && !(num % 5 == 0 && num % 6 == 0)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
