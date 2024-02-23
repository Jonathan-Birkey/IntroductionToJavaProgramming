/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.13 (Vowel or consonant?) Write a program that prompts the user to enter a
 *     letter and check whether the letter is a vowel or consonant. For a nonletter input, display
 *     invalid input. Here is a sample run:
 *     <p>Enter a letter: B B is a consonant
 *     <p>Enter a letter: a a is a vowel
 *     <p>Enter a letter: # # is an invalid input
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    char letter = input.next().charAt(0);
    input.close();
    if (letter == 'a'
        || letter == 'A'
        || letter == 'e'
        || letter == 'E'
        || letter == 'i'
        || letter == 'I'
        || letter == 'o'
        || letter == 'O'
        || letter == 'u'
        || letter == 'U') System.out.printf("%c is a vowel", letter);
    else if (letter == 'b'
        || letter == 'B'
        || letter == 'c'
        || letter == 'C'
        || letter == 'd'
        || letter == 'D'
        || letter == 'f'
        || letter == 'F'
        || letter == 'g'
        || letter == 'G'
        || letter == 'h'
        || letter == 'H'
        || letter == 'j'
        || letter == 'J'
        || letter == 'k'
        || letter == 'K'
        || letter == 'l'
        || letter == 'L'
        || letter == 'm'
        || letter == 'M'
        || letter == 'n'
        || letter == 'N'
        || letter == 'p'
        || letter == 'P'
        || letter == 'q'
        || letter == 'Q'
        || letter == 'r'
        || letter == 'R'
        || letter == 's'
        || letter == 'S'
        || letter == 't'
        || letter == 'T'
        || letter == 'v'
        || letter == 'V'
        || letter == 'w'
        || letter == 'W'
        || letter == 'x'
        || letter == 'X'
        || letter == 'y'
        || letter == 'Y'
        || letter == 'z'
        || letter == 'Z') System.out.printf("%c is a consonant", letter);
    else System.out.printf("%c is an invalid input", letter);
  }
}
