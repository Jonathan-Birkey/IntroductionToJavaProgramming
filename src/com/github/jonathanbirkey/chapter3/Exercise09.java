/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 11Dec2021
 *
 * Exercise3.9
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d_1 d_2 d_3 d_4 d_5 d_6 d_7 d_8 d_9 d_10. The last
 * digit, d_10, is a checksum, which is calculated from the other 9 digits
 * using the following formula:
 * (d_1 * 1 + d_2 * 2 + d_3 * 3 + d_4 * 4 + d_5 * 5 +
 *  d_6 * 6 + d_7 * 7 + d_8 * 8 + d_9 * 9) % 11
 *  If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 *  convention. Write a program that prompts the user to enter the first 9 digits and
 *  displays the 10-digit ISBN (including leading zeros). Your program should read
 *  the input as an integer. Here are sample runs:
 *  Enter the first 9 digits of an ISBN as integer: 013601267
 *  The ISBN-10 number is 0136012671
 *  Enter the first 9 digits of an ISBN as integer: 013031997
 *  The ISBN-10 number is 013031997X
 **/
package com.github.jonathanbirkey.chapter3;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();
        int d9 = number % 10;
        number = number / 10;
        int d8 = number % 10;
        number = number / 10;
        int d7 = number % 10;
        number = number / 10;
        int d6 = number % 10;
        number = number / 10;
        int d5 = number % 10;
        number = number / 10;
        int d4 = number % 10;
        number = number / 10;
        int d3 = number % 10;
        number = number / 10;
        int d2 = number % 10;
        number = number / 10;
        int d1 = number % 10;
        number = number / 10;
        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 *4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        if (checksum == 10)
            System.out.printf("%d%d%d%d%d%d%d%d%dX\n", d1, d2, d3, d4, d5, d6, d7, d8, d9);
        else
            System.out.printf("%d%d%d%d%d%d%d%d%d%d\n", d1, d2, d3, d4, d5, d6, d7, d8, d9, checksum);
    }
}
