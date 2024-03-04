/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Display calendars) Write a program that prompts the user to enter the year and first day
 *     of the year and displays the calendar table for the year on the console. For example, if the
 *     user entered the year 2013, and 2 for Tuesday, January 1, 2013, your program should display
 *     the calendar for each month in the year, as follows:
 *     <p>January 2013
 *     <p>---------------------------
 *     <p>Sun Mon Tue Wed Thu Fri Sat
 *     <p>1 2 3 4 5
 *     <p>6 7 8 9 10 11 12
 *     <p>13 14 15 16 17 18 19
 *     <p>20 21 22 23 24 25 26
 *     <p>27 28 29 30 31
 *     <p>
 *     <p>...
 *     <p>
 *     <p>December 2013
 *     <p>---------------------------
 *     <p>Sun Mon Tue Wed Thu Fri Sat
 *     <p>1 2 3 4 5 6 7
 *     <p>8 9 10 11 12 13 14
 *     <p>15 16 17 18 19 20 21
 *     <p>22 23 24 25 26 27 28
 *     <p>29 30 31
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise29 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter year: (e.g., 2012): ");
    int year = input.nextInt();
    System.out.print("Enter first day of year (0 - Saturday, 1 - Sunday, 2 - Monday, etc): ");
    int firstDay = input.nextInt();
    input.close();

    int daysInMonth = 0;
    String monthHeader;

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
          monthHeader = "       January " + year;
          break;
        case 2:
          monthHeader = "       Febuary " + year;
          break;
        case 3:
          monthHeader = "        March " + year;
          break;
        case 4:
          monthHeader = "        April " + year;
          break;
        case 5:
          monthHeader = "         May " + year;
          break;
        case 6:
          monthHeader = "         June " + year;
          break;
        case 7:
          monthHeader = "         July " + year;
          break;
        case 8:
          monthHeader = "        August " + year;
          break;
        case 9:
          monthHeader = "      September " + year;
          break;
        case 10:
          monthHeader = "       October " + year;
          break;
        case 11:
          monthHeader = "       November " + year;
          break;
        case 12:
          monthHeader = "       December " + year;
          break;
        default:
          monthHeader = "Invalid";
      }

      System.out.printf(
          "%s\n---------------------------\nSun Mon Tue Wed Thu Fri Sat\n", monthHeader);

      int dayShift = 0;
      if (firstDay > 0) {
        dayShift = firstDay - 1;
      } else {
        dayShift = firstDay + 6;
      }

      for (int i = 0; i < dayShift; i++) {
        System.out.print("    ");
      }

      for (int date = 1; date <= daysInMonth; date++) {
        if (dayShift == 6) {
          if (date < 10) {
            System.out.printf("  %d\n", date);
          } else {
            System.out.printf(" %d\n", date);
          }
          dayShift = 0;
        } else {
          if (date < 10) {
            System.out.printf("  %d ", date);
          } else {
            System.out.printf(" %d ", date);
          }
          dayShift++;
        }
      }
      System.out.print("\n\n");

      firstDay = (firstDay + daysInMonth) % 7;
    }
  }
}
