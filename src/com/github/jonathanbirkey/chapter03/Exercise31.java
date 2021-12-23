/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 *
 * Exercise 3.31
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
 * user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
 * from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
 * dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars,
 * respectively. Here are the sample runs:
 *
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 0
 * Enter the dollar amount: 100
 * $100.0 is 681.0 yuan
 *
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 1
 * Enter the RMB amount: 10000
 * 10000.0 yuan is $1468.43
 *
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * Incorrect input
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();
        System.out.print("Enter the dollar amount: ");
        double amount = input.nextDouble();
        input.close();

        if(convert == 0)
            System.out.printf("$%.2f is %.2f yuan", amount, amount * exchangeRate);
        else if(convert == 1)
            System.out.printf("%.2f yuan is $%.2f", amount, amount / exchangeRate);
        else
            System.out.print("Incorrect input");
    }
}
