/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.24 (Order three cities) Write a program that prompts the user to enter three
 *     cities and displays them in ascending order. Here is a sample run:
 *     <p>Enter the first city: Chicago Enter the second city: Los Angeles Enter the third city:
 *     Atlanta The three cities in alphabetical order are Atlanta Chicago Los Angeles
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first city: ");
    String city1 = input.nextLine();
    System.out.print("Enter the second city: ");
    String city2 = input.nextLine();
    System.out.print("Enter the third city: ");
    String city3 = input.nextLine();
    input.close();

    System.out.print("The three cities in alphabetical order are ");
    if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
      System.out.printf("%s ", city1);
      if (city2.compareTo(city3) < 0) System.out.printf("%s %s", city2, city3);
      else System.out.printf("%s %s", city3, city2);
    } else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
      System.out.printf("%s ", city2);
      if (city1.compareTo(city3) < 0) System.out.printf("%s %s", city1, city3);
      else System.out.printf("%s %s", city3, city1);
    } else {
      System.out.printf("%s ", city3);
      if (city1.compareTo(city2) < 0) System.out.printf("%s %s", city1, city2);
      else System.out.printf("%s %s", city2, city1);
    }
  }
}
