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
    final int NUMBER_OF_PRIMES = 1000;
    final int NUMBER_OF_PRIMES_PER_LINE = 8;
    int count = 0;
    int number = 2;

    System.out.println("The first 1,000 prime numbers are \n");
    while (count <= NUMBER_OF_PRIMES) {
      boolean isPrime = true;
      for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        count++;
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          System.out.println(number);
        } else System.out.printf("%d ", number);
      }
      number++;
    }
  }
}
