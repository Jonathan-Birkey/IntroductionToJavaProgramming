/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 28Feb2024
 *     <p>(Occurrence of max numbers) Write a program that reads integers, finds the largest of
 *     them, and counts its occurrences. Assume the input ends with number 0. Suppose you entered 3
 *     5 2 5 5 5 0; the program finds that the largest is 5 and the occurrence count for 5 is 4. If
 *     no input is entered, display "No numbers are entered except 0".
 *     <p>(Hint: Maintain two variables, max and count. max stores the current max number and count
 *     stores its occurrences. Initially, assign the first number to max and 1 to count. Compare
 *     each subsequent number with max. If the number is greater than max, assign it to max and
 *     reset count to 1. If the number is equal to max, increment count by 1.)
 */
package com.github.jonathanbirkey.chapter05;

import java.util.Scanner;

public class Exercise41 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    int max = 0;
    int count = 0;
    int number = -1;
    
    System.out.print("Enter Numbers: ");
    
    while(number != 0) {
    	number = input.nextInt();
    	if(number > max) {
    		max = number;
    		count = 1;
    	} else if(number == max) {
    		count++;
    	}
    	
    }
    input.close();
    System.out.printf("The largest number is %d\n", max);
    System.out.printf("The occurrence count of the largest number is %d", count);
  }
}
