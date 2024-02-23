/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 5.5 (Conversion from kilograms to pounds and pounds to kilograms) Write a program
 *     that displays the following two tables side by side: Kilograms Pounds | Pounds Kilograms 1
 *     2.2 | 20 9.09 3 6.6 | 25 11.36 ... 197 433.4 | 510 231.82 199 437.8 | 515 234.09
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise05 {
  public static void main(String[] args) {
    //     %-15s           %10s      %5s  \t    %-15s           %10
    // [Kilograms      ][    Pounds][    |]  [Pounds         ][  Kilograms]
    System.out.printf(
        "%-15s%10s%5s\t%-15s%10s\n", "Kilomegrams", "Pounds", "|", "Pounds", "Kilograms");
    int lbs = 20;
    for (int i = 1; i < 200; i += 2) {
      System.out.printf("%-15d%9.1f%6s\t%-15d%7.2f\n", i, i * 2.2, "|", lbs, lbs / 2.2);
      lbs += 5;
    }
  }
}
