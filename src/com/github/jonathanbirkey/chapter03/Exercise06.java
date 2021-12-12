/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 11Dec2021
 *
 * Exercise3.6
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet
 * and 10 inches, you will enter 5 for feet and 10 for inches. Here is a sample run:
 * Enter weight in pounds: 140
 * Enter feet: 5
 * Enter inches: 10
 * BMI is 20.087702275404553
 * Normal
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        int feet = input.nextInt();
        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        double height = feet * 12 + inches;

        // Compute BMI
        double weightInKilograms = weight * 0.45359237;
        double heightInMeters = height * 0.0254;
        double bmi = weightInKilograms /
                (heightInMeters * heightInMeters);
        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
