/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise 2.14
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and dividing,
 * by the square of your height in meters. Write a program that prompts the user to
 * enter a weight in pounds and height in inches and displays the BMI. Note one pound
 * is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a sample run:
 **/
package com.github.jonathanbirkey.chapter02;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        input.close();

        weight = weight * 0.45359237;
        height = height * 0.0254;
        double bmi = weight / (height * height);
        System.out.printf("BMI is %.4f", bmi);
    }
}
