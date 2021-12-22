/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 **/
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The are of the hexagon is %f", area);
    }
}
