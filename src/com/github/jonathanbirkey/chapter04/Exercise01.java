/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();
        double s = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
