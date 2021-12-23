/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise2.11
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and display the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. Here is a sample
 * run of the program:
 *
 * Enter the number of years: 5
 * The population in 5 years is 325932969
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numOfYears = input.nextInt();
        input.close();

        double current_population = 312032486;
        long sec_per_year = 365 * 24 * 60 * 60;
        double births_per_year = sec_per_year / 7.0;
        double deaths_per_year = sec_per_year / 13.0;
        double immigrants_per_year = sec_per_year / 45.0;
        double growth_rate = births_per_year + immigrants_per_year - deaths_per_year;
        for(int i = 0; i < numOfYears; i++) {
            current_population += growth_rate;
        }
        System.out.printf("The population in %d years is %d", numOfYears, (int) current_population);
    }
}
