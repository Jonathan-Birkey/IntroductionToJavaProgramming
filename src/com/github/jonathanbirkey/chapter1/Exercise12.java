package com.github.jonathanbirkey.chapter1;

public class Exercise12 {
    public static void main(String[] args) {
        double avg_mph = 24 / ((100.0 * 60.0 + 35.0) / (60.0 * 60.0));
        double avg_kph = avg_mph * 1.6;
        System.out.printf("%f\n", avg_kph);
    }
}
