/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.15 (Display the ASCII character table) Write a program that prints the
 *     characters in the ASCII character table from ! to ~. Display 10 characters per line. The
 *     ASCII table is given in Appendix B. Characters are separated by exactly one space.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise15 {
  public static void main(String[] args) {
    int charCount = 0;
    for (int i = '!'; i <= '~'; i++) {
      if (charCount == 10) {
        System.out.print("\n");
        charCount = 0;
      }
      System.out.printf("%c ", i);
      charCount++;
    }
  }
}
