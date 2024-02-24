/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 12Dec2021
 *     <p>Exercise 3.14 (Game: heads or tails) Write a program that lets the user guess whether the
 *     flip of a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 *     which represents head or tail. The program prompts the user to enter a guess, and reports
 *     whether the guess is correct or incorrect.
 */
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    int randomNumber = (int) (System.currentTimeMillis() % 2);
    Scanner input = new Scanner(System.in);
    System.out.print("Enter guess (0 for heads, 1 for tails): ");
    int answer = input.nextInt();
    input.close();

    if (answer == randomNumber) {
      System.out.println("Correct!");
    } else {
      System.out.println("Incorrect.");
    }
  }
}
