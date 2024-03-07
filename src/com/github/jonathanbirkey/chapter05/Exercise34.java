/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that plays the
 *     scissor–rock–paper game. Revise the program to let the user continuously play until either
 *     the user or the computer wins more than two times than its opponent.
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise34 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int computerWins = 0;
    int userWins = 0;

    while (computerWins < 2 && userWins < 2) {
      int computerPick = (int) (Math.random() * 3);
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
          break;
        default:
          System.out.print("Invalide");
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
          break;
        default:
          System.out.print("Invalide");
      }
      if (computerPick == userPick) {
        System.out.println(" too. It is a draw");
      } else if (computerPick == 0 && userPick == 1) {
        System.out.println(". You won\n");
        userWins++;
      } else if (computerPick == 1 && userPick == 2) {
        System.out.println(". You won\n");
        userWins++;
      } else if (computerPick == 2 && userPick == 0) {
        System.out.println(". You won\n");
        userWins++;
      } else if (computerPick == 0 && userPick == 2) {
        System.out.println(". You lost\n");
        computerWins++;
      } else if (computerPick == 1 && userPick == 0) {
        System.out.println(". You lost\n");
        computerWins++;
      } else if (computerPick == 2 && userPick == 1) {
        System.out.println(". You lost\n");
        computerWins++;
      }
    }
    input.close();
    System.out.printf("\nFinal score\nComputer: %d\tUser: %d", computerWins, userWins);
  }
}
