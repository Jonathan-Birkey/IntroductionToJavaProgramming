/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.printf("The area of the polygon is %f", area);
    }
}
