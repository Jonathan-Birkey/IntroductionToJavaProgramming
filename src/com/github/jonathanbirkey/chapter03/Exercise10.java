/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 11Dec2021
 *
 * Exercise3.10
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly generate an addition
 * question with two integers less than 100.
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d? ", number1, number2);
        int answer = input.nextInt();
        input.close();

        if (number1 + number2 == answer)
            System.out.print("You are correct!");
        else{
            System.out.println("Your answer is wrong.");
            System.out.printf("%d + %d should be %d", number1, number2, number1 + number2);
        }
    }
}
