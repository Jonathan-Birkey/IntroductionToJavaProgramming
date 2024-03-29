/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 07Dec2021
 *     <p>Exercise 1.12 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour,
 *     40 minutes, and 35 seconds. Write a program that displays the average speed in kilometers per
 *     hour. (Note 1 mile is equal to 1.6 kilometers.)
 */
package com.github.jonathanbirkey.chapter01;

public class Exercise12 {
  public static void main(String[] args) {
    double averageMPH = 24 / ((100.0 * 60.0 + 35.0) / (60.0 * 60.0));
    double averageKPH = averageMPH * 1.6;
    System.out.printf("%f\n", averageKPH);
  }
}
