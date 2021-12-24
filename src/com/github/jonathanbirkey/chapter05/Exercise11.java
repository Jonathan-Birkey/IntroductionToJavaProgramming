/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *
 * Exercise 5.11
 * (Find numbers divisible by 5 or 6, but not both) Write a program that displays
 * all the numbers from 100 to 200 (10 per line) that are divisible by 5 or 6, but not
 * both. Numbers are separated by exactly one space.
 **/
package com.github.jonathanbirkey.chapter05;

public class Exercise11 {
    public static void main(String[] args) {
        int charCount = 0;
        for(int i = 100; i <= 200; i++){
            if(charCount == 10) {
                System.out.print("\n");
                charCount = 0;
            }
            if((i % 5 == 0 || i % 6 ==0) && !(i % 5 == 0 && i % 6 == 0)){
                System.out.printf("%d ", i);
                charCount++;
            }
        }
    }
}
