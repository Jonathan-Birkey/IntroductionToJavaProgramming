/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 **/
package com.github.jonathanbirkey.chapter02;

import javax.swing.*;
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

        if(convert == 0)
            System.out.printf("$%.2f is %.2f yuan", amount, amount * exchangeRate);
        else if(convert == 1)
            System.out.printf("%.2f yuan is $%.2f", amount, amount / exchangeRate);
        else
            System.out.print("Incorrect input");
    }
}
