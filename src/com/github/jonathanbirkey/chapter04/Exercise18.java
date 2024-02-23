/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.18 (Student major and status) Write a program that prompts the user to enter
 *     two characters and displays the major and status represented in the characters. The first
 *     character indicates the major and the second is a number character 1, 2, 3, or 4, which
 *     indicates whether a student is a freshman, sophomore, junior, or senior. Suppose that the
 *     following characters are used to denote the majors:
 *     <p>M: Mathematics C: Computer Science I: Information Technology Here are sample runs:
 *     <p>Enter two characters: M1 Mathematics Freshman
 *     <p>Enter two characters: C3 Computer Science Junior
 *     <p>Enter two characters: T3 Invalid input
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two characters: ");
    String studentData = input.next();
    input.close();
    char major = studentData.charAt(0);
    char level = studentData.charAt(1);

    if (major != 'M' && major != 'C' && major != 'I'
        || level != '1' && level != '2' && level != '3' && level != '4')
      System.out.print("Invalid input");
    else {
      if (major == 'M') System.out.print("Mathematics ");
      else if (major == 'C') System.out.print("Computer Science ");
      else System.out.print("Information Technology ");
      if (level == '1') System.out.print("Freshman");
      else if (level == '2') System.out.print("Sophomore");
      else if (level == '3') System.out.print("Junior");
      else System.out.print("Senior");
    }
  }
}
