/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 11Dec2021
 *     <p>Exercise 3.5 (Find future dates) Write a program that prompts the user to enter an integer
 *     for today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt
 *     the user to enter the number of days after today for a future day and display the future day
 *     of the week. Here is a sample run:
 *     <p>Enter today's day: 1 Enter the number of days elapsed since today: 3 Today is Monday and
 *     the future day is Thursday
 */
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter today's day (Sunday is 0, Monday is 1, ..., and Saturday is 6): ");
    int today = input.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int daysElapsed = input.nextInt();
    input.close();
    int futureDay = (today + daysElapsed) % 7;
    System.out.print("Today is ");

    switch (today) {
      case 0:
        System.out.print("Sunday");
        break;
      case 1:
        System.out.print("Monday");
        break;
      case 2:
        System.out.print("Tuesday");
        break;
      case 3:
        System.out.print("Wednesday");
        break;
      case 4:
        System.out.print("Thursday");
        break;
      case 5:
        System.out.print("Friday");
        break;
      case 6:
        System.out.print("Saturday");
        break;
      default:
        System.out.print("Invalid Day");
    }

    System.out.print(" and the future day is ");

    if (futureDay == 0) {
      System.out.print("Sunday");
    } else if (futureDay == 1) {
      System.out.print("Monday");
    } else if (futureDay == 2) {
      System.out.print("Tuesday");
    } else if (futureDay == 3) {
      System.out.print("Wednesday");
    } else if (futureDay == 4) {
      System.out.print("Thursday");
    } else if (futureDay == 5) {
      System.out.print("Friday");
    } else if (futureDay == 6) {
      System.out.print("Saturday");
    } else {
      System.out.print("Invalid Day");
    }
  }
}
