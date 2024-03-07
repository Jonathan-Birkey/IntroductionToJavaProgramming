/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two-digit
 *     number. The two digits in the number are distinct. (Hint: Generate the first digit. Use a
 *     loop to continuously generate the second digit until it is different from the first digit.)
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise32 {
  public static void main(String[] args) {
    int lotteryDigit1 = (int) (Math.random() * 10);
    int lotteryDigit2 = 0;
    do {
    	lotteryDigit2 = (int) (Math.random() * 10);
    }while(lotteryDigit1 == lotteryDigit2);
    
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lotter pick (two digits): ");
    int guess = input.nextInt();
    input.close();

    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;

    System.out.printf("The lottery number is %d%d\n", lotteryDigit1, lotteryDigit2);

    if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
      System.out.println("Exact match: you win $10,000");
    } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
      System.out.println("Match all digits: you win $3,000");
    } else if (guessDigit1 == lotteryDigit1
        || guessDigit1 == lotteryDigit2
        || guessDigit2 == lotteryDigit1
        || guessDigit2 == lotteryDigit2) {
      System.out.println("Match one digit: you win $1,000");
    } else {
      System.out.println("Sorry, no match");
    }
  }
}
