/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *
 * Exercise 4.12
 * (Hex to binary) Write a program that prompts the user to enter a hex digit and
 * displays its corresponding binary number in four digits. For example, hex digit 7
 * is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For
 * an incorrect input, display invalid input. Here is a sample run:
 *
 * Enter a hex digit: B
 * The binary value is 1011
 *
 * Enter a hex digit: G
 * G is an invalid input
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.next();
        input.close();
        int hexInt = -1;
        if(hexString.equals("0"))
            hexInt = 0;
        else if(hexString.equals("1"))
            hexInt = 1;
        else if(hexString.equals("2"))
            hexInt = 2;
        else if(hexString.equals("3"))
            hexInt = 3;
        else if(hexString.equals("4"))
            hexInt = 4;
        else if(hexString.equals("5"))
            hexInt = 5;
        else if(hexString.equals("6"))
            hexInt = 6;
        else if(hexString.equals("7"))
            hexInt = 7;
        else if(hexString.equals("8"))
            hexInt = 8;
        else if(hexString.equals("9"))
            hexInt = 9;
        else if(hexString.equals("A"))
            hexInt = 10;
        else if(hexString.equals("B"))
            hexInt = 11;
        else if(hexString.equals("C"))
            hexInt = 12;
        else if(hexString.equals("D"))
            hexInt = 13;
        else if(hexString.equals("E"))
            hexInt = 14;
        else if(hexString.equals("F"))
            hexInt = 15;

        if(hexInt == -1)
            System.out.printf("%s is an invalid input", hexString);
        else {
            String result = Integer.toBinaryString(hexInt);
            System.out.printf("The binary value is %s", result);
        }
    }
}
