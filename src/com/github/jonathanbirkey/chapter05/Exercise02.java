/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *
 * Exercise 5.2
 * (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five
 * random subtraction questions. Revise the program to generate 10 random
 * addition questions for two integers between 1 and 15. Display the correct
 * count and test time.
 **/
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 15) + 1;
            int number2 = (int) (Math.random() * 15) + 1;

            System.out.printf("What is %d + %d? ", number1, number2);
            int answer = input.nextInt();

            if(answer == number1 + number2){
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.printf("Your answer is wrong.\n%d + %d should be %d", number1, number2, number1 + number2);
            }
            count++;
            output += "\n" + number1 + " + " + number2 + " = " + answer +
                    ((number1 + number2 == answer) ? " correct": " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.printf("Correct count is %d\nTest time is %d seconds\n%s", correctCount, testTime/1000, output);
    }
}
