/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *
 * Exercise 5.17
 * (Display pyramid) Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid, as presented in the following sample run:
 *
 * Enter the number of lines: 7
 *             1
 *           2 1 2
 *         3 2 1 2 3
 *       4 3 2 1 2 3 4
 *     5 4 3 2 1 2 3 4 5
 *   6 5 4 3 2 1 2 3 4 5 6
 * 7 6 5 4 3 2 1 2 3 4 5 6 7
 **/
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numOfLines = input.nextInt();
        input.close();

        for(int i = 1; i <= numOfLines; i ++){
            for(int j = numOfLines; j > 1; j--){
                if(j <= i)
                    System.out.printf("%d ", j);
                else
                    System.out.print("  ");
            }

            for(int j = 1; j <= numOfLines; j++){
                if(j <= i)
                    System.out.printf("%d ", j);
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
