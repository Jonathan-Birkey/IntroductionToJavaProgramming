/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 08Dec2021
 *
 * Exercise1.7
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the maximum number of years and remain-
 * ing days for the minutes. For simplicity, assume that a year has 365 days. Here is
 * a sample run:
 *
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        input.close();

        long years = minutes / (365 * 24 * 60);
        long minutes_remaining = minutes % (365 * 24 * 60);
        long days = minutes_remaining / (24 * 60);
        System.out.printf("%d minutes is approximately %d years and %d days\n", minutes, years, days);
    }
}
