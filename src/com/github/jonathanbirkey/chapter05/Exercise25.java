/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 27Dec2021
 *
 * Exercise 5.25
 * (Compute Pi) You can approximate p by using the following summation:
 *
 * Pi - 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + -^i+1/2i-1)
 * Write a program that displays the Pi value for i = 10000,20000,...,and100000.
 **/
package com.github.jonathanbirkey.chapter05;

public class Exercise25 {
    public static void main(String[] args) {
        double sum1 = 0;
        for(int i = 2; i <= 10000; i++){
            sum1 -= (Math.pow(-1, i + 1)) / (2.0 * i - 1.0);
        }
        double Pi1 = 4 * (1.0 - sum1);
        System.out.printf("Pi value when i = 10000 is %f\n", Pi1);

        double sum2 = 0;
        for(int j = 2; j <= 20000; j++){
            sum2 -= (Math.pow(-1, j + 1)) / (2.0 * j - 1.0);
        }
        double Pi2 = 4 * (1.0 - sum2);
        System.out.printf("Pi value when i = 20000 is %f\n", Pi2);

        double sum3 = 0;
        for(int k = 2; k <= 100000; k++){
            sum3 -= (Math.pow(-1, k + 1)) / (2.0 * k - 1.0);
        }
        double Pi3 = 4 * (1.0 - sum3);
        System.out.printf("Pi value when i = 100000 is %f\n", Pi3);
    }
}
