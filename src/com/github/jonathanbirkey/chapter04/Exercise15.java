/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.15 (Phone key pads) The international standard letter/number mapping found on
 *     the telephone is shown below: 1 = voicemail 2 = a, b, c 3 = d, e, f 4 = g, h, i 5 = j, k, l 6
 *     = m, n, o 7 = p, q, r, s 8 = t, u, v 9 = w, x, y, z
 *     <p>Write a program that prompts the user to enter a lowercase or uppercase letter and
 *     displays its corresponding number. For a nonletter input, display invalid input.
 *     <p>Enter a letter: A The corresponding number is 2
 *     <p>Enter a letter: a The corresponding number is 2
 *     <p>Enter a letter: + + is an invalid input
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    String letter = input.next().toLowerCase();
    input.close();

    switch (letter) {
      case "a":
      case "b":
      case "c":
        System.out.print("The corresponding number is 2");
        break;
      case "d":
      case "e":
      case "f":
        System.out.print("The corresponding number is 3");
        break;
      case "g":
      case "h":
      case "i":
        System.out.print("The corresponding number is 4");
        break;
      case "j":
      case "k":
      case "l":
        System.out.print("The corresponding number is 5");
        break;
      case "m":
      case "n":
      case "o":
        System.out.print("The corresponding number is 6");
        break;
      case "p":
      case "q":
      case "r":
      case "s":
        System.out.print("The corresponding number is 7");
        break;
      case "t":
      case "u":
      case "v":
        System.out.print("The corresponding number is 8");
        break;
      case "w":
      case "x":
      case "y":
      case "z":
        System.out.print("The corresponding number is 9");
        break;
      default:
        System.out.printf("%s is an invalid input.", letter);
    }
  }
}
