/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 07Dec2021
 **/
package com.github.jonathanbirkey.chapter1;

public class Exercise11 {
    public static void main(String[] args) {
        double current_population = 312032486;
        long sec_per_year = 365 * 24 * 60 * 60;
        double births_per_year = sec_per_year / 7.0;
        double deaths_per_year = sec_per_year / 13.0;
        double immigrants_per_year = sec_per_year / 45.0;
        double growth_rate = births_per_year + immigrants_per_year - deaths_per_year;
        for(int i = 0; i < 5; i++) {
            System.out.printf("%f\n", current_population);
            current_population += growth_rate;
        }
    }
}
