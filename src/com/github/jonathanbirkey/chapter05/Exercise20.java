/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>Exercise 5.20 (Display prime numbers between 2 and 1,000) Modify the program given in
 *     Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive. Display eight
 *     prime numbers per line. Numbers are separated by exactly one space.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise20 {
  public static void main(String[] args) {
    final int numberOfPrimes = 1000;
    final int numberOfPrimesPerLine = 8;
    int count = 0;
    int number = 2;

    System.out.println("The first 1,000 prime numbers are \n");
    while (count <= numberOfPrimes) {
      boolean isPrime = true;
      for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        count++;
        if (count % numberOfPrimesPerLine == 0) {
          System.out.println(number);
        } else {
          System.out.printf("%d ", number);
        }
      }
      number++;
    }
  }
}
