/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *
 * Exercise4.11
 * (Decimal to hex) Write a program that prompts the user to enter an integer
 * between 0 and 15 and displays its corresponding hex number. For an incorrect
 * input number, display invalid input. Here are some sample runs:
 *
 * Enter a decimal value (0 to 15): 11
 * The hex value is B
 *
 * Enter a decimal value (0 to 15): 5
 * The hex value is 5
 *
 * Enter a decimal value (0 to 15): 31
 * 31 is an invalid input
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();
        input.close();

        if (0 <= decimal && decimal <= 9)
            System.out.printf("The hex value is %d", decimal);
        else if (decimal == 10)
            System.out.printf("The hex value is %c", 'A');
        else if (decimal == 11)
            System.out.printf("The hex value is %c", 'B');
        else if (decimal == 12)
            System.out.printf("The hex value is %c", 'C');
        else if (decimal == 13)
            System.out.printf("The hex value is %c", 'D');
        else if (decimal == 14)
            System.out.printf("The hex value is %c", 'E');
        else if (decimal == 15)
            System.out.printf("The hex value is %c", 'F');
    }
}
