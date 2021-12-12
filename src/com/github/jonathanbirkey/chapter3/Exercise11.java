/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 11Dec2021
 *
 * Exercise3.11
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 has 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 has 31 days.
 **/
package com.github.jonathanbirkey.chapter3;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month and year: ");
        int month = input.nextInt() - 1;
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int daysPerMonth = 0;

        switch (month) {
            case 0:
                daysPerMonth = 31;
                System.out.print("January ");
                break;
            case 1:
                if(isLeapYear)
                    daysPerMonth = 29;
                else
                    daysPerMonth = 28;
                System.out.print("February ");
                break;
            case 2:
                daysPerMonth = 31;
                System.out.print("March ");
                break;
            case 3:
                daysPerMonth = 30;
                System.out.print("April ");
                break;
            case 4:
                daysPerMonth = 31;
                System.out.print("May ");
                break;
            case 5:
                daysPerMonth = 30;
                System.out.print("June ");
                break;
            case 6:
                daysPerMonth = 31;
                System.out.print("July ");
                break;
            case 7:
                daysPerMonth = 31;
                System.out.print("August ");
                break;
            case 8:
                daysPerMonth = 30;
                System.out.print("September ");
                break;
            case 9:
                daysPerMonth = 31;
                System.out.print("October ");
                break;
            case 10:
                daysPerMonth = 30;
                System.out.print("November ");
                break;
            case 11:
                daysPerMonth = 31;
                System.out.print("December ");
        }
        System.out.printf("%d has %d days.", year, daysPerMonth);
    }
}
