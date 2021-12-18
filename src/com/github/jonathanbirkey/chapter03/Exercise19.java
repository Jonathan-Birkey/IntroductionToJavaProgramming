/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
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
        if(a + b < c || b + c < a || c + a < b)
            System.out.println("Invalid input.");
        else
            System.out.printf("perimeter is %d", a + b + c);
    }
}
