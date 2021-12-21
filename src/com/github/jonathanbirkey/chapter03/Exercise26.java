/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.printf("Is %d divisible by 5 and 6? ", num);
        if(num % 5 == 0 && num % 6 ==0)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.printf("Is %d divisible by 5 or 6? ", num);
        if(num % 5 == 0 || num % 6 ==0)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.printf("Is %d divisible by 5 or 6, but not both? ", num);
        if((num % 5 == 0 || num % 6 ==0) && !(num % 5 == 0 && num % 6 == 0))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
