/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 21Dec2021
 *
 * Exercise3.30
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock. Here is a sample run:
 *
 *  Enter the time zone offset to GMT: −5
 * The current time is 4:50:34 AM
 **/
package com.github.jonathanbirkey.chapter03;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        long offset = input.nextLong();
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours % 24) + offset;

        if(currentHour > 12)
            System.out.printf("The current time is %d:%d:%d PM\n",currentHour-12,currentMinute,currentSecond);
        else
            System.out.printf("The current time is %d:%d:%d AM\n",currentHour,currentMinute,currentSecond);

    }
}
