/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 10Dec2021
 *
 * Exercise 3.2
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
 * two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() / 10 / 10 % 10);

        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d + %d? ", number1, number2, number3);
        int answer = input.nextInt();
        input.close();
        System.out.printf("%d + %d + %d = %d is %b", number1, number2, number3,
                answer, (number1 + number2 + number3 == answer));
    }
}
