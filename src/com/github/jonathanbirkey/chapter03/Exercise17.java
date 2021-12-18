/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        int computerPick = (int)(Math.random() * 3);
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int userPick = input.nextInt();
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
