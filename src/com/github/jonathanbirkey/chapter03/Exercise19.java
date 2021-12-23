/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 *
 * Exercise3.19
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display
 * that the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the sides of a triangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        
        if(a + b < c || b + c < a || c + a < b)
            System.out.println("Invalid input.");
        else
            System.out.printf("perimeter is %d", a + b + c);
    }
}
