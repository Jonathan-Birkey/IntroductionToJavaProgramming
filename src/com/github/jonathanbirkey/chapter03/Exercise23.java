/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 18Dec2021
 *
 * Exercise3.23
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the rectangle centered at
 * (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
 * (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
 * rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
 * vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
 * cover all cases.) Here are two sample runs:
 *
 * Enter a point with two coordinates: -4.9 2.49
 * Point (-4.9, 2.49) is in the rectangle
 *
 * Enter a point with two coordinates: -5.1 -2.4
 * Point (-5.1, -2.4) is not in the rectangle
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        if(x > 5 || x < -5 || y > 5 || y < -5)
            System.out.printf("Point (%.2f, %.2f) is not in the rectangle", x, y);
        else
            System.out.printf("Point (%.2f, %.2f) is in the rectangle", x, y);
    }
}
