/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.18 (Display four patterns using loops) Use nested loops that display the
 *     following patterns in four separate programs:
 *     <p>Pattern A Pattern B Pattern C Pattern D 1 1 2 3 4 5 6 1 1 2 3 4 5 6 1 2 1 2 3 4 5 2 1 1 2
 *     3 4 5 1 2 3 1 2 3 4 3 2 1 1 2 3 4 1 2 3 4 1 2 3 4 3 2 1 1 2 3 1 2 3 4 5 1 2 5 4 3 2 1 1 2 1 2
 *     3 4 5 6 1 6 5 4 3 2 1 1
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise18 {
  public static void main(String[] args) {
    int numOfLines = 6;

    System.out.println("Pattern A");
    for (int i = 1; i <= numOfLines; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.printf("%d ", j);
      }
      System.out.print("\n");
    }

    System.out.println("\nPattern B");
    for (int i = 1; i <= numOfLines; i++) {
      for (int j = 1; j <= numOfLines; j++) {
        if (j <= numOfLines - i + 1) {
          System.out.printf("%d ", j);
        }
      }
      System.out.print("\n");
    }

    System.out.println("\nPattern C");
    for (int i = 1; i <= numOfLines; i++) {
      for (int j = numOfLines; j >= 1; j--) {
        if (j <= i) {
          System.out.printf(" %d", j);
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }

    System.out.println("\nPattern D");
    for (int i = 1; i <= numOfLines; i++) {
      for (int k = 1; k < numOfLines - (numOfLines - i); k++) System.out.print("  ");
      for (int j = 1; j <= numOfLines; j++) {
        if (j <= numOfLines - i + 1) {
          System.out.printf("%d ", j);
        }
      }
      System.out.print("\n");
    }
  }
}
