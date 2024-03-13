/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Math: combinations) Write a program that displays all possible combinations for picking
 *     two numbers from integers 1 to 7. Also display the total number of all combinations.
 *     <p>1 2
 *     <p>1 3
 *     <p>...
 *     <p>...
 *     <p>The total number of all combinations is 21
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise43 {
  public static void main(String[] args) {
    int totalCombinations = 0;

    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        if (j != i && j > i) {
          System.out.printf("%d %d\n", i, j);
          totalCombinations++;
        }
      }
    }

    System.out.printf("The total number of all combinations is %d", totalCombinations);
  }
}
