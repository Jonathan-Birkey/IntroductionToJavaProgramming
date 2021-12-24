/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *
 * Exercise 5.9
 * (Find the two highest scores) Write a program that prompts the user to enter the
 * number of students and each student’s name and score, and finally displays the
 * student with the highest score and the student with the second-highest score. Use
 * the next() method in the Scanner class to read a name rather than using the
 * nextLine() method. Assume that the number of students is at least 2.
 **/
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();
        System.out.printf("Enter a student name and score %d times: ", numOfStudents);
        int i = 0;
        double currentHighestScore = 0;
        String currentHighestStudent = "";
        double currentSecondScore = 0;
        String currentSecondStudent = "";

        while(i < numOfStudents){
            String studentName = input.next();
            double score = input.nextDouble();
            if(score > currentHighestScore){
                currentSecondScore = currentHighestScore;
                currentSecondStudent = currentHighestStudent;
                currentHighestScore = score;
                currentHighestStudent = studentName;
            } else if (score > currentSecondScore){
                currentSecondScore = score;
                currentSecondStudent = studentName;
            }
            i++;
        }
        System.out.printf("The student with the highest score was %s, with a score of %.2f\n" +
                        "The student with the second highest score was %s with a score of %.2f",
                currentHighestStudent, currentHighestScore, currentSecondStudent, currentSecondScore);
        input.close();
    }
}
