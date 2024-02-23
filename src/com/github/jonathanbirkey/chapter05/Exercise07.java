/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 24Dec2021
 *     <p>(Financial application: compute future tuition) Suppose the tuition for a university is
 *     $10,000 this year and increases 5% every year. In one year, the tuition will be $10,500.
 *     Write a program that displays the tuition in 10 years, and the total cost of four years’
 *     worth of tuition starting after the tenth year.
 */
package com.github.jonathanbirkey.chapter05;

public class Exercise07 {
  public static void main(String[] args) {
    double tuition = 10000;
    for (int i = 0; i < 10; i++) {
      tuition *= 1.05;
    }
    System.out.printf("The tuition in 10 years will be %.2f\n", tuition);

    double totalCost = 0;
    for (int j = 0; j < 4; j++) {
      totalCost += tuition;
      tuition *= 1.05;
    }
    System.out.printf("The total cost of four years in 10 years will be %.2f", totalCost);
  }
}
