/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 27Dec2021
 *
 * Exercise 5.26
 * (Compute e) You can approximate e using the following summation:
 *
 * e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
 *
 * Write a program that displays the e value for i = 1, 2, ..., and 20. Format
 * the number to display 16 digits after the decimal point. (Hint: Because
 * i!=i*(i-1)* c *2*1,then
 *
 * 1/i! is 1 / i(i - 1)!
 *
 * Initialize e and item to be 1, and keep adding a new item to e. The new item is
 * the previous item divided by i, for i >= 2.)
 **/
package com.github.jonathanbirkey.chapter05;

public class Exercise26 {
    public static void main(String[] args) {
        double e = 1;
        for(int i = 1; i <= 20; i++){
            double item = 1;
            for(int j = i; j > 0; j--){
                item *= j;
            }
            e += 1 / item;
            System.out.printf("%.16f\n", e);
        }
    }
}
