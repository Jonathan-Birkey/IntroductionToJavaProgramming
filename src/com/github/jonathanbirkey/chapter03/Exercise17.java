/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 *
 * Exercise3.17
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor–
 * rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
 * a paper can wrap a rock.) The program randomly generates a number 0, 1, or
 * 2 representing scissor, rock, and paper. The program prompts the user to enter
 * a number 0, 1, or 2 and displays a message indicating whether the user or the
 * computer wins, loses, or draws. Here are sample runs:
 *
 * scissor (0), rock (1), paper (2): 1
 * The computer is scissor. You are rocker. You won
 *
 * scissor (0), rock (1), paper (2): 2
 * The computer is paper. You are paper too. It is a draw
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        int computerPick = (int)(Math.random() * 3);
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int userPick = input.nextInt();
        input.close();

        switch (computerPick) {
            case 0:
                System.out.print("The computer is scissor. ");
                break;
            case 1:
                System.out.print("The computer is rock. ");
                break;
            case 2:
                System.out.print("The computer is paper. ");
        }
        switch (userPick) {
            case 0:
                System.out.print("You are scissor");
                break;
            case 1:
                System.out.print("You are rock");
                break;
            case 2:
                System.out.print("You are paper");
        }
        if (computerPick == userPick)
            System.out.println(" too. It is a draw");
        else if (computerPick == 0 && userPick == 1)
            System.out.println(". You won");
        else if (computerPick == 1 && userPick == 2)
            System.out.println(". You won");
        else if (computerPick == 2 && userPick == 0)
            System.out.println(". You won");
        else if (computerPick == 0 && userPick == 2)
            System.out.println(". You lost");
        else if (computerPick == 1 && userPick == 0)
            System.out.println(". You lost");
        else if (computerPick == 2 && userPick == 1)
            System.out.println(". You lost");
    }
}
