/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Display the first days of each month) Write a program that prompts the user to enter the
 *     year and first day of the year, then displays the first day of each month in the year. For
 *     example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, your program
 *     should display the following output:
 *     <p>January 1, 2013 is Tuesday
 *     <p>...
 *     <p>December 1, 2013 is Sunday
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise28 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter year: (e.g., 2012): ");
    int year = input.nextInt();
    System.out.print("Enter first day of year (0 - Saturday, 1 - Sunday, 2 - Monday, etc): ");
    int firstDay = input.nextInt();
    input.close();

    int futureDay = firstDay;
    int daysInMonth = 0;
    String monthStr;

    for (int month = 1; month <= 12; month++) {
      if (month == 1
          || month == 3
          || month == 5
          || month == 7
          || month == 8
          || month == 10
          || month == 12) {
        daysInMonth = 31;
      } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        daysInMonth = 30;
      } else {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          daysInMonth = 29;
        } else {
          daysInMonth = 28;
        }
      }
      switch (month) {
        case 1:
          monthStr = "January";
          break;
        case 2:
          monthStr = "Febuary";
          break;
        case 3:
          monthStr = "March";
          break;
        case 4:
          monthStr = "April";
          break;
        case 5:
          monthStr = "May";
          break;
        case 6:
          monthStr = "June";
          break;
        case 7:
          monthStr = "July";
          break;
        case 8:
          monthStr = "August";
          break;
        case 9:
          monthStr = "September";
          break;
        case 10:
          monthStr = "October";
          break;
        case 11:
          monthStr = "November";
          break;
        case 12:
          monthStr = "December";
          break;
        default:
          monthStr = "Invalid";
      }
      switch (futureDay) {
        case 0:
          System.out.printf("%s 1, %d is Saturday\n", monthStr, year);
          break;
        case 1:
          System.out.printf("%s 1, %d is Sunday\n", monthStr, year);
          break;
        case 2:
          System.out.printf("%s 1, %d is Monday\n", monthStr, year);
          break;
        case 3:
          System.out.printf("%s 1, %d is Tuesday\n", monthStr, year);
          break;
        case 4:
          System.out.printf("%s 1, %d is Wednesday\n", monthStr, year);
          break;
        case 5:
          System.out.printf("%s 1, %d is Thursday\n", monthStr, year);
          break;
        case 6:
          System.out.printf("%s 1, %d is Friday\n", monthStr, year);
          break;
        default:
          System.out.println("Invalid");
      }
      futureDay = (futureDay + daysInMonth) % 7;
    }
  }
}
