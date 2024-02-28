/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 27Dec2021
 *     <p>(Display leap years) Write a program that displays all the leap years, 10 per line, from
 *     101 to 2100, separated by exactly one space. Also display the number of leap years in this
 *     period.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise27 {
  public static void main(String[] args) {
    int yearsPerLine = 10;
    int printedYears = 0;
    int startYear = 101;
    int endYear = 2100;
    int totalLeapYears = 0;

    for (int i = startYear; i <= endYear; i++) {
      if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
        printedYears++;
        if (printedYears == yearsPerLine) {
          System.out.printf("%d\n", i);
          printedYears = 0;
        } else {
          System.out.printf("%d ", i);
        }
        totalLeapYears++;
      }
    }
    System.out.printf("\nNumber of leap years in this period: %d", totalLeapYears);
  }
}
