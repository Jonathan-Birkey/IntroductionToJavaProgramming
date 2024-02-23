/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.17 (Days of a month) Write a program that prompts the user to enter the year
 *     and the first three letters of a month name (with the first letter in uppercase) and displays
 *     the number of days in the month. If the input for month is incorrect, display a message as
 *     presented in the following sample runs:
 *     <p>Enter a year: 2001 Enter a month: Jan Jan 2001 has 31 days
 *     <p>Enter a year: 2016 Enter a month: jan jan is not a correct month name
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    System.out.print("Enter a month: ");
    String month = input.next();
    input.close();

    if (65 <= (int) month.charAt(0) && (int) month.charAt(0) <= 90) {
      if (month.equals("Jan")
          || month.equals("Mar")
          || month.equals("May")
          || month.equals("Jul")
          || month.equals("Aug")
          || month.equals("Oct")
          || month.equals("Dec")) System.out.printf("%s %d has 31 days", month, year);
      else if (month.equals("Apr")
          || month.equals("Jun")
          || month.equals("Sep")
          || month.equals("Nov")) System.out.printf("%s %d has 30 days", month, year);
      else if (month.equals("Feb")) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
          System.out.printf("%s %d has 29 days", month, year);
        else System.out.printf("%s %d has 28 days", month, year);
      } else System.out.printf("%s is not a correct month name", month);
    } else System.out.printf("%s is not a correct month name", month);
  }
}
